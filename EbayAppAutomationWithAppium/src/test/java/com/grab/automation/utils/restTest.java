package com.grab.automation.utils;

import static com.jayway.restassured.RestAssured.given;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import com.grab.automation.WebDriverFactory;
import com.jayway.restassured.response.Response;

public class restTest {
	
	String pID = null;
	String Url="https://rink.hockeyapp.net/api/2/apps";
	Response va1= given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(Url) .then().extract().response(); ;
	String AddingURL="?format=apk&avtoken=b2b9cfc5f1fab2c7fc2b272c31e3d182d0967cd2";
	
	public static void downloadAPK() throws IOException 
	{
	    String pID = null;
		String Url="https://rink.hockeyapp.net/api/2/apps";
		Response va1= given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(Url) .then().extract().response();

		switch(WebDriverFactory.product)
		{
		case "MOB":
		{
			switch(WebDriverFactory.tier)
			{
			case "qa":  pID=va1.path("apps.public_identifier[1]");
			System.out.println("pid for mob-dev "+pID);
			break;
			case "prod": pID=va1.path("apps.public_identifier[2]");
			System.out.println("pid for mob-prod "+pID);
			break;
			default : System.out.println("No matching tier");
			}
			break;
		}
		case "MOB2":
		{
			switch(WebDriverFactory.tier)
			{
			case "qa":   pID=va1.path("apps.public_identifier[6]");
			System.out.println("pid for mob2-qa "+pID);
			break;
			case "preprod": pID=va1.path("apps.public_identifier[7]");
			System.out.println("pid for mob2-prod "+pID);
			break;
			case "prod": pID=va1.path("apps.public_identifier[13]");
			System.out.println("pid for mob2-prod "+pID);
			break;
			default :System.out.println("No matching tier");
			}
			break;
		}
		case "MTPM":
		{
			switch(WebDriverFactory.tier)
			{
			case "prod":  pID=va1.path("apps.public_identifier[7]");
			System.out.println("pid for mtpm-prod "+pID);
			break;
			case "qa": pID=va1.path("apps.public_identifier[6]");
			System.out.println("pid for mtpm-qa "+pID);
			break;
			case "stag": pID=va1.path("apps.public_identifier[10]");
			System.out.println("pid for mtpm-stag "+pID);
			break;
			default:System.out.println("No matching tier");
			}
			break;
		}
		case "DWPM":
		{
			switch(WebDriverFactory.tier)
			{
			case "dev": pID=va1.path("apps.public_identifier[4]"); 
			System.out.println("pid for dwpm-dev "+pID);
			break;
			default:System.out.println("No matching tier");
			}
			break;
		}
		default:System.out.println("No matching product found");
	}

		String AddingURL="?format=apk&avtoken=b2b9cfc5f1fab2c7fc2b272c31e3d182d0967cd2";
		URL fileId = null;

		String urlForQAid="https://rink.hockeyapp.net/api/2/apps/"+pID+"/app_versions";
		Response  val2 =given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(urlForQAid)
				.then().extract().response(); 
		System.out.println("_________________________________________");
		System.out.println(val2.path("app_versions.id[0]")+"");
		System.out.println(val2.path("app_versions.version[0]")+"");
		System.out.println(val2.path("app_versions.shortversion[0]")+"");
		PropFileHandler.writeProperty("version",val2.path("app_versions.shortversion[0]")+"");
		System.out.println("_________________________________________");

		try {
			fileId = new URL(urlForQAid+"/"+val2.path("app_versions.id[0]")+ AddingURL);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}

		System.out.println("Created URL: "+fileId);
		Response  va2 =  given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(fileId)
				.then().extract().response();
		va2.getHeaders().get("Content-Type").equals("application/vnd.android.package-archive");
		va2.getStatusLine();  

		final InputStream inputStream = given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").request().expect().log().headers().when().get(fileId).asInputStream();
		final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1!=(n=inputStream.read(buf)))
		{
			byteArrayOutputStream.write(buf, 0, n);

		}
		byteArrayOutputStream.close();
		inputStream.close();
		byte[] response = byteArrayOutputStream.toByteArray();
		String apkName = WebDriverFactory.product+"_"+WebDriverFactory.tier+".apk";
		String outPutFileName  = WebDriverFactory.appDir+File.separator+apkName;

		File   f = new File(outPutFileName);
		if (f.exists()==true) {
			f.delete();
		} 
		FileOutputStream fos = new FileOutputStream(outPutFileName);
		fos.write(response);
		fos.close();
		System.out.println("Finished");


	}

	public static String getAPKPath(){
		String apkName = WebDriverFactory.product+"_"+WebDriverFactory.tier+".apk";
//		System.out.println(apkName);
		return apkName;
	}
	
	public static String getPID(){
		String pID = null;
		String Url="https://rink.hockeyapp.net/api/2/apps";
		Response va1= given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(Url) .then().extract().response(); ;

		switch(WebDriverFactory.product)
		{
		case "MOB":
		{
			switch(WebDriverFactory.tier)
			{
			case "qa":  pID=va1.path("apps.public_identifier[1]");
			System.out.println("pid for mob-dev "+pID);
			break;
			case "prod": pID=va1.path("apps.public_identifier[2]");
			System.out.println("pid for mob-prod "+pID);
			break;
			default : System.out.println("No matching tier");
			}
			break;
		}
		case "MOB2":
		{
			switch(WebDriverFactory.tier)
			{
			case "qa":   pID=va1.path("apps.public_identifier[8]");
			System.out.println("pid for mob2-qa "+pID);
			break;
			case "prod": pID=va1.path("apps.public_identifier[9]");
			System.out.println("pid for mob2-prod "+pID);
			break;
			default :System.out.println("No matching tier");
			}
			break;
		}
		case "MTPM":
		{
			switch(WebDriverFactory.tier)
			{
			case "prod":  pID=va1.path("apps.public_identifier[7]");
			System.out.println("pid for mtpm-prod "+pID);
			break;
			case "qa": pID=va1.path("apps.public_identifier[6]");
			System.out.println("pid for mtpm-qa "+pID);
			break;
			case "stag": pID=va1.path("apps.public_identifier[10]");
			System.out.println("pid for mtpm-stag "+pID);
			break;
			default:System.out.println("No matching tier");
			}
			break;
		}
		case "DWPM":
		{
			switch(WebDriverFactory.tier)
			{
			case "dev": pID=va1.path("apps.public_identifier[4]"); 
			System.out.println("pid for dwpm-dev "+pID);
			break;
			default:System.out.println("No matching tier");
			}
			break;
		}
		default:System.out.println("No matching product found");
		}
		return pID;
	}
	
	public static String getResponseForPID(String PID){
		String AddingURL="?format=apk&avtoken=b2b9cfc5f1fab2c7fc2b272c31e3d182d0967cd2";
		

		String urlForQAid="https://rink.hockeyapp.net/api/2/apps/"+PID+"/app_versions";
		Response  val2 =given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(urlForQAid)
				.then().extract().response(); 
		System.out.println("_________________________________________");
		System.out.println(val2.path("app_versions.id[0]")+"");
		System.out.println(val2.path("app_versions.version[0]")+"");
		System.out.println(val2.path("app_versions.shortversion[0]")+"");
		System.out.println("_________________________________________");
        return val2.path("app_versions.shortversion[0]")+"";
	}
	
	public static URL getFileId(String PID){
      String AddingURL="?format=apk&avtoken=b2b9cfc5f1fab2c7fc2b272c31e3d182d0967cd2";
	 String urlForQAid="https://rink.hockeyapp.net/api/2/apps/"+PID+"/app_versions";
	 Response  val2 =given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(urlForQAid)
				.then().extract().response(); 
		URL fileId = null;
		try {
			fileId = new URL(urlForQAid+"/"+val2.path("app_versions.id[0]")+ AddingURL);
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}

		System.out.println("Created URL: "+fileId);
		return fileId;
	}
	
	public static void readAPKResponse(String fileID) throws IOException{
		Response  va2 =  given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").get(fileID)
				.then().extract().response();
		va2.getHeaders().get("Content-Type").equals("application/vnd.android.package-archive");
		va2.getStatusLine();  

		final InputStream inputStream = given().header("X-HockeyAppToken","7da6819ad9f9441d88d4359c76669b41").request().expect().log().headers().when().get(fileID).asInputStream();
		final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int n = 0;
		while (-1!=(n=inputStream.read(buf)))
		{
			byteArrayOutputStream.write(buf, 0, n);

		}
		byteArrayOutputStream.close();
		inputStream.close();
		byte[] response = byteArrayOutputStream.toByteArray();
		String apkName = WebDriverFactory.product+"_"+WebDriverFactory.tier+".apk";
		String outPutFileName  = WebDriverFactory.appDir+File.separator+apkName;

		File   f = new File(outPutFileName);
		if (f.exists()==true) {
			f.delete();
		} 
		FileOutputStream fos = new FileOutputStream(outPutFileName);
		fos.write(response);
		fos.close();
		System.out.println("Finished");

	}
}

