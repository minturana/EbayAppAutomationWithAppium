package com.grab.automation.utils;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class RestAPIUtils {


	public void ConvertJavaObjectToJSON() {
		ObjectMapper mapper = new ObjectMapper();
		RestAPIUtils obj = new RestAPIUtils();

		//Object to JSON in file
		try {
			mapper.writeValue(new File("c:\\file.json"), obj);
			
			
			//Object to JSON in String
			String jsonInString = mapper.writeValueAsString(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void ConvertJSONToJavaObject() {

		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "{'name' : 'mkyong'}";

		//JSON from String to Object
		try {
			RestAPIUtils obj = mapper.readValue(jsonInString, RestAPIUtils.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
