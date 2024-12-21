package com.jp.prototype.pattern;

public class ConfigManagement implements Configuration {

	String databaseUrl = null;

	@Override
	public void setProperty(String key, String value) {

		if ("database.url".equals(key)) {
			this.databaseUrl = value;
		}

	}

	@Override
	public String getProperty(String key) {
		if ("database.url".equals(key)) {
			return databaseUrl;
		}
		return null;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	
		return new String(databaseUrl);
	}

}
