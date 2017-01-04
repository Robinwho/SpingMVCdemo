package com.crunchify.tutorials;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
 * @Robin
 */

public class CrunchifyJSONFileWrite {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		
		JSONObject obj = new JSONObject();
		obj.put("Name", "clec");
		obj.put("Author", "Robin");
		
		JSONArray company = new JSONArray();
		company.add("Company:B");
		company.add("Company:A");
		company.add("Company:T");
		obj.put("Company List", company);
		
		// try-with-resources
		try (FileWriter file = new FileWriter("D:/WebDev\file.txt")){
			file.write(obj.toJSONString());
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
	}
}
}
