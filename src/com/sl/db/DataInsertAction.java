package com.sl.db;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;

public class DataInsertAction extends BaseAction implements Map<String, Object>{

	private static final long serialVersionUID = 1L;
	private static Category m_logger = Logger.getLogger(DataInsertAction.class.getName());
	private HashMap<String,Object> hashMap = new HashMap<String,Object>();

	
	HashMap<String,Object> data;
	


	public HashMap<String, Object> getData() {
		m_logger.debug("getData:" + data);
		return data;
	}

	public void setData(HashMap<String, Object> data) {
		m_logger.debug("setData:" + data);
		this.data = data;
	}
	public String Initialize(){
		m_logger.debug("initialize");
		return INPUT;
	}

	public String execute() {
		m_logger.debug("called DataInsertAction");
		try {
			String ids[] = (String [])hashMap.get("id");
			
			m_logger.debug("inserting data" + ids[0]);
			if( "1".equals( ids[0] ) )
				return INPUT;
			
			
		} catch (Exception e) {
			m_logger.error(e);
			addActionError("entity.notfound");
			return ERROR;
		}	
		return SUCCESS;
	}

	@Override
	public int size() {
		return hashMap.size();
	}

	@Override
	public boolean isEmpty() {
		return hashMap.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		m_logger.debug("contains:" + key);
		return hashMap.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		m_logger.debug("containsValue:" + value);
		return hashMap.containsValue(value);
	}

	@Override
	public Object get(Object key) {
		m_logger.debug("get:" + key ); 
		return hashMap.get(key);
	}

	public String put(String key, String value) {
		m_logger.debug("put:" + key + " " + value );
		hashMap.put(key, value);
		return value;
	}	

	public String put(String key, String value[]) {
		m_logger.debug("put:" + key + " " + value );
		hashMap.put(key, value);
		return value.toString();
	}	

	public String put(String key, File value[]) {
		m_logger.debug("put:" + key + " " + value );
		hashMap.put(key, value);
		return value.toString();
	}	
	
	@Override
	public Object put(String key, Object value) {
		m_logger.debug("put:" + key + " " + value );
		return hashMap.put(key, value);
	}

	@Override
	public Object remove(Object key) {
		m_logger.debug("remove:" + key);
		return hashMap.remove(key);
	}

	@Override
	public void putAll(Map<? extends String, ? extends Object> m) {
		m_logger.debug("putAll" + m);
		hashMap.putAll(m);
	}

	@Override
	public void clear() {
		hashMap.clear();
	}

	@Override
	public Set<String> keySet() {
		return hashMap.keySet();
	}

	@Override
	public Collection<Object> values() {
		return hashMap.values();
	}

	@Override
	public Set<java.util.Map.Entry<String, Object>> entrySet() {
		return hashMap.entrySet();
	}
}