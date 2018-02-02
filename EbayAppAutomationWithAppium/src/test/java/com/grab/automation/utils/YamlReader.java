/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grab.automation.utils;

import static com.grab.automation.utils.ConfigPropertyReader.getProperty;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

import org.testng.Reporter;
import org.yaml.snakeyaml.Yaml;

@SuppressWarnings("unchecked")
public class YamlReader {
	
	public YamlReader() {
		setYamlFilePath();
	}


	public static String yamlFilePath = "";

	public static int generateRandomNumber(int MinRange, int MaxRange) {
		int randomNumber = MinRange
				+ (int) (Math.random() * ((MaxRange - MinRange) + 1));
		return randomNumber;
	}

	public static String getData(String token) {
		return getYamlValue(token);
	}

	public static String getMapValue(Map<String, Object> object, String token) {
		// TODO: check for proper yaml token string based on presence of '.'
		String[] st = token.split("\\.");
		return parseMap(object, token).get(st[st.length - 1]).toString();
	}

	private static String getValue(String token) throws FileNotFoundException {
		Reader doc = new FileReader(yamlFilePath);
		Yaml yaml = new Yaml();
		Map<String, Object> object = (Map<String, Object>) yaml.load(doc);
		return getMapValue(object, token);

	}
	
	public static String getYamlValue(File path, String token) {
		try {
			return getValue(token);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	public static Map<String, Object> getYamlValues(File path,String token) {
		Reader doc;
		try {
			doc = new FileReader(path);
		} catch (FileNotFoundException ex) {
			System.out.println("File not valid or missing!!!");
			ex.printStackTrace();
			return null;
		}
		Yaml yaml = new Yaml();
		// TODO: check the type casting of object into the Map and create
		// instance in one place
		Map<String, Object> object = (Map<String, Object>) yaml.load(doc);
		return parseMap(object, token + ".");
	}
	

	public static String getYamlValue(String token) {
		try {
			return getValue(token);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	public static Map<String, Object> getYamlValues(String token) {
		Reader doc;
		try {
			doc = new FileReader(yamlFilePath);
		} catch (FileNotFoundException ex) {
			System.out.println("File not valid or missing!!!");
			ex.printStackTrace();
			return null;
		}
		Yaml yaml = new Yaml();
		// TODO: check the type casting of object into the Map and create
		// instance in one place
		Map<String, Object> object = (Map<String, Object>) yaml.load(doc);
		return parseMap(object, token + ".");
	}

	private static Map<String, Object> parseMap(Map<String, Object> object,
			String token) {
		if (token.contains(".")) {
			String[] st = token.split("\\.");
			object = parseMap((Map<String, Object>) object.get(st[0]),
					token.replace(st[0] + ".", ""));
		}
		return object;
	}

	public static String setYamlFilePath() {
		String tier = getProperty("Config.properties", "tier").trim().toUpperCase();
		String product	=	getProperty("Config.properties", "productName").toUpperCase();
		if (tier.equalsIgnoreCase("dev")) {
			yamlFilePath = "src/test/resources/testdata/"+product+"/DEV_TestData.yml";

		} else if (tier.equalsIgnoreCase("qa")) {
			yamlFilePath = "src/test/resources/testdata/"+product+"/QA_TestData.yml";
		} else if (tier.equalsIgnoreCase("pr") || tier.equalsIgnoreCase("pristine")) {
			yamlFilePath = "src/test/resources/testdata/"+product+"/PR_TestData.yml";
		} else if (tier.equalsIgnoreCase("prod") || tier.equalsIgnoreCase("production") || tier.equalsIgnoreCase("preprod")) {
			yamlFilePath = "src/test/resources/testdata/"+product+"/PROD_TestData.yml";
		}
		else if (tier.equalsIgnoreCase("stag") || tier.equalsIgnoreCase("STAG")) {
			yamlFilePath = "src/test/resources/testdata/"+product+"/STAG_TestData.yml";
		}
		else {
			Reporter.log("YOU HAVE PROVIDED WRONG TIER IN CONFIG!!! using dev test data", true);
		}
		System.out.println(yamlFilePath);
		return yamlFilePath;
	}
}
