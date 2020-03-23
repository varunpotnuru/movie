package com.capgemini.service;

public interface Validation {
	public static String idpattern = "[1][0-9][0-9][1-9]";
	public static String passwordpattern = "[a-c][a-b][a-b][a-b][a-c][a-c][a-c][a-c]*";
	
	public  boolean validatedata(String data,String pattern);
	public boolean validatedata(String data);
	

	

}
