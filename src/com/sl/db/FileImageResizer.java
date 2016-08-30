package com.sl.db;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import org.apache.log4j.Category;

import javax.imageio.ImageIO;

public class FileImageResizer {
	private static Category m_logger = Category
			.getInstance(FileImageResizer.class.getName());

	public static void ResizeImage(File source, File target, int width, int height,
			String imageOutput) throws Exception{
		try {
			// Read the original image from the Server Location
			BufferedImage bufferedImage = ImageIO.read(source);
			// Calculate the new Height if not specified
			int calcHeight = height > 0 ? height : (width
					* bufferedImage.getHeight() / bufferedImage.getWidth());
			// Write the image
			ImageIO.write(createResizedCopy(bufferedImage, width, calcHeight),
					imageOutput, target);
		} catch (Exception e) {
			m_logger.error("Problem with image: " + source + ":" + e);
			throw e;
		}
	}

	private static BufferedImage createResizedCopy(Image originalImage,
			int scaledWidth, int scaledHeight) {
		BufferedImage scaledBI = new BufferedImage(scaledWidth, scaledHeight,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = scaledBI.createGraphics();
		g.setComposite(AlphaComposite.Src);
		g.drawImage(originalImage, 0, 0, scaledWidth, scaledHeight, null);
		g.dispose();
		return scaledBI;
	}
	
	//
	public static String getFileIconFileName(File file, String iconFolderName, int width, int height, String extension){
		File parentFile = file.getParentFile();
		String path = parentFile.getAbsolutePath();
		String fileName = file.getName();
		String fileNameNoExtension = fileName.substring(0,fileName.lastIndexOf("."));
		String iconName = path + "/" + iconFolderName + "/" + fileNameNoExtension + "_" + Integer.toString(width) + "_" + Integer.toString(height) + "." + extension;
		return iconName;
	}
	public static File getFilenameWithExtension(File file, String ext){
		String fileName = file.getAbsolutePath();
		int i = fileName.lastIndexOf(".");
		if( i >= 0){
			String fileNameNoExtension = fileName.substring(0,fileName.lastIndexOf("."));
			fileName = fileNameNoExtension + "." + ext;
		}
		return new File(fileName);
	}
	public static File getFileIconFile(File file, String iconFolderName, int width, int height){
		File parentFile = file.getParentFile();
		String path = parentFile.getAbsolutePath();
		String fileName = file.getName();
		String iconName = path + "/" + iconFolderName + Integer.toString(width) + "x" + Integer.toString(height) + "/" + fileName;
		return new File(iconName);
	}
	
}
