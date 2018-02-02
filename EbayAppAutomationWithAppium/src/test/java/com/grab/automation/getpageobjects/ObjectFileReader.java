package com.grab.automation.getpageobjects;

import static com.grab.automation.utils.ConfigPropertyReader.getProperty;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class reads the PageObjectRepository text files. Uses buffer reader.
 *
 * @author prashantshukla
 *
 */
public class ObjectFileReader {

	static String tier;
	static String platform;
	static String product;
	static String device;
	static String filepath = "src/test/resources/PageObjectRepository/";
	
	private static String setPath(String pageName) {
		
		//return filepath + platform +File.separator+ product.toUpperCase()+File.separator+ tier + pageName + ".spec";
		File file=new File(filepath + device +File.separator+ platform +File.separator+ product.toUpperCase()+File.separator+ tier.toUpperCase() + pageName+ ".spec");
		System.out.println(file.exists());
		return filepath + device +File.separator+ platform +File.separator+ product.toUpperCase()+File.separator+ tier.toUpperCase() + pageName+ ".spec";
		
	}


	private static String[] getElement(FileReader specFile, String elementName)
			throws Exception {

		ArrayList<String> elementLines = getSpecSection(specFile);
		for (String elementLine : elementLines) {
			//System.out.println(elementLine);
			if (elementLine.startsWith(elementName)) {
				return elementLine.split(" ", 3);
			}
		}
		throw new Exception();
	}

	
	public static String[] getELementFromFile(String pageName, String elementName) {
		initFilePath();
		try {
			FileReader specFile = new FileReader(filepath + device +File.separator+ platform +File.separator+ product.toUpperCase()+File.separator+ tier.toUpperCase() + pageName+ ".spec");
			return getElement(specFile, elementName);
		} catch (Exception e) {
			try {
				FileReader specFile = new FileReader(filepath + device +File.separator+ platform +File.separator+ product.toUpperCase()+File.separator+ tier.toUpperCase() + "AndroidVersionAbove6"+ ".spec");
				return getElement(specFile, elementName);
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}	
		}
		return null;
	}
	
	public static String[] getELementFromFile(String pageName, String elementName, String specSpec,Boolean needToLook) {
			try {
				FileReader specFile = new FileReader(filepath + device +File.separator+ platform +File.separator+ product.toUpperCase()+File.separator+ tier.toUpperCase() +specSpec + ".spec");
				return getElement(specFile, elementName);
			} catch (Exception ex) {
				ex.printStackTrace();
			}	
		return null;
	}

	public static String getPageTitleFromFile(String pageName) {
		initFilePath();
		BufferedReader br = null;
		String returnElement = "";
		try {
			br = new BufferedReader(new FileReader(setPath(pageName)));
			String line = br.readLine();

			while (line != null && !line.startsWith("========")) {
				String titleId = line.split(":", 3)[0];
				if (titleId.equalsIgnoreCase("pagetitle")
						|| titleId.equalsIgnoreCase("title")
						|| titleId.equalsIgnoreCase("page title")) {
					returnElement = line;
					break;
				}
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//System.out.println(returnElement);
		return returnElement.split(":", 2)[1].trim();
	}

	private static ArrayList<String> getSpecSection(FileReader specfile) {
		String readBuff = null;
		ArrayList<String> elementLines = new ArrayList<>();

		try {
			BufferedReader buff = new BufferedReader(specfile);
			try {
				boolean flag = false;
				readBuff = buff.readLine();
				while ((readBuff = buff.readLine()) != null) {
					if (readBuff.startsWith("========")) {
						flag = !flag;
					}
					if (flag) {
						elementLines.add(readBuff.trim().replaceAll("[ \t]+",
								" "));
					}
					if (!elementLines.isEmpty() && !flag) {
						break;
					}
				}
			} finally {
				buff.close();
				if (elementLines.get(0).startsWith("========")) {
					elementLines.remove(0);
				}
			}
		} catch (FileNotFoundException e) {
			System.out
			.println("Spec File not found at location :- " + filepath);
		} catch (IOException e) {
			System.out.println("exceptional case");
		}
		return elementLines;
	}

	public static void initFilePath() {
		setTier();
		setPlatform();
		setProduct();
		setDevice();
	}

   private static void setDevice(){
	device=getProperty("device");
	if(device.equalsIgnoreCase("mobile"))
		device="Mobile";
	else if(device.equalsIgnoreCase("tablet"))
		device="Tablet";
   }
   
	private static void setPlatform() {
		platform = getProperty("platform");
		if (platform.equalsIgnoreCase("ios"))
			platform = "IOS";
		else if (platform.equalsIgnoreCase("android"))
			platform = "Android";
	}

	private static void setProduct() {
		product = getProperty("productName");
		if (product.equalsIgnoreCase("MTPM"))
			product = "MTPM";
		if (product.equalsIgnoreCase("DWPM"))
			product = "DWPM";
		if (product.equalsIgnoreCase("MOB"))
			product = "MOB";
		
	}

	private static void setTier() {
		switch (Tiers.valueOf(getProperty("Config.properties", "tier"))) {
		case production:
		case PROD:
		case PRODUCTION:
		case Production:
		case prod:
			case PREPROD:
			case Preprod:
			case PreProduction:
			tier = "PROD/";
			break;
		case pristine:
		case PR:
		case PRISTINE:
		case Pristine:
		case pr:
			tier = "PR/";
			break;
		case qa:
		case QA:
		case Qa:
			tier = "QA/";
			break;
		case Dev:
		case dev:
		case DEV:
			tier = "DEV/";
			break;
		case mice:
		case MICE:
		case Mice:
			tier = "MICE/";
			break;
		case stag:
		case STAG:
			tier = "STAG/";
			break;

		}
	}

}
