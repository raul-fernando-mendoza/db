package com.sl.db;

import java.util.Date;
import java.util.HashMap;

public class Data<String, Object> extends HashMap<String, Object>{
	int integerValue;
	String stringValue;
	Date dateValue;
	public int getIntegerValue() {
		return integerValue;
	}
	public void setIntegerValue(int integerValue) {
		this.integerValue = integerValue;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	public Date getDateValue() {
		return dateValue;
	}
	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}
	

}
