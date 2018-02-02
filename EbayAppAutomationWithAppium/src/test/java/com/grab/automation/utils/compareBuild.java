package com.grab.automation.utils;

import static com.grab.automation.utils.ConfigPropertyReader.getProperty;
import static com.jayway.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.jayway.restassured.response.Response;

public class compareBuild extends restTest {
	
	static String PID;
	
	public static void main()
	{
		String version = null;
		PID=getPID();
		getFilePath();
		ConfigReader();
		getResponseFromHockeyApp(PID);
		updateConfig(version);
	}
		public static String getFilePath()
		{
			File classpathRoot = new File(System.getProperty("user.dir"));
	        File location = new File(classpathRoot, "src/test/resources/TestDataLibrary/version.properties");
		    String file = location.getAbsolutePath().trim().toString();
		    System.out.println(file);
		    return file;
		}
		
		public static Map<String,String>ConfigReader()
		{
		    String[] configKeys = {"Android_mobv2_qa","iOS_mobv2_prod","Android_mobv2_prod","iOS_mobv2_QA"};
			Map<String, String> config = new HashMap<>();
			for (String string : configKeys) {
			   config.put(string,getProperty(getFilePath(),string));
			}
			System.out.println(config);
			return config;
	    }
		
		public static String getResponseFromHockeyApp(String PID)
		{
			String urlForQAid="https://rink.hockeyapp.net/api/2/apps/"+PID+"/app_versions";
			Response  val2 =given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(urlForQAid)
					.then().extract().response(); 
			String title=val2.path("app_versions.title[0]");
			System.out.println(title);
		    String 	shortVersion=val2.path("app_versions.shortversion[0]");
			return shortVersion;
		}
		
		public static void updateConfig(String version)
		{		
			String[] configKeys = {"Android_mobv2_qa","iOS_mobv2_prod","Android_mobv2_prod","iOS_mobv2_QA"};
			Map<String, String> config = new HashMap<>();
			for (String string : configKeys) {
			  String propertyValue= getProperty(getFilePath(), string);
			  if(!propertyValue.equals(getResponseFromHockeyApp(PID)))
			  {
				  config.put(string,getResponseFromHockeyApp(PID));
			  }
			  else{
				  System.out.println("No change in build");
			  }
			
			}}
	}


