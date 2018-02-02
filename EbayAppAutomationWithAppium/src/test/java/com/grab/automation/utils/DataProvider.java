package com.grab.automation.utils;
import java.util.Properties;

import static com.grab.automation.utils.YamlReader.getYamlValue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class DataProvider {
	static String filePath = "./src/test/resources/testdata/MOB2/Data.properties";
	static Properties properties = new Properties();
	static String ASM_dataSheet = YamlReader.getYamlValue("ASM_Data_File.path");
	static String ASM_dataSheetSeparator = YamlReader
			.getYamlValue("ASM_Data_File.data-separator");

	public static Object[][] csvProvider(String csvFile, String hasHeader) {
		BufferedReader br = null;
		ArrayList<String> dataRows = new ArrayList<>();
		String line = "";
		try {
			br = new BufferedReader(new FileReader(csvFile));
			if (hasHeader.equalsIgnoreCase("yes")
					|| hasHeader.equalsIgnoreCase("true")) {
				System.out.println("has header");
				br.readLine();// in case first line is header in the csv file
			}
			while ((line = br.readLine()) != null) {
				dataRows.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		Object[][] returnObject = new Object[dataRows.size()][1];
		for (int i = 0; i < dataRows.size(); i++) {
			returnObject[i][0] = dataRows.get(i);
		}
		return returnObject;
	}

	public static String csvReaderRowSpecific(String csvFile, String hasHeader,
			String rowNumberExact) {
		BufferedReader br = null;
		ArrayList<String> dataRows = new ArrayList<>();
		String line = "";
		try {
			br = new BufferedReader(new FileReader(csvFile));
			if (hasHeader.equalsIgnoreCase("yes")
					|| hasHeader.equalsIgnoreCase("true")) {
				br.readLine();// in case first line is header in the csv file
			}
			while ((line = br.readLine()) != null) {
				dataRows.add(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		int rowNumber = Integer.parseInt(rowNumberExact) - 1;
		return dataRows.get(rowNumber);
	}

	// Read data against given Row Id and column Name and return it to caller
	public static String getColumnData(String rowId, String columnName) {
		BufferedReader br = null;
		ArrayList<String> dataRows = new ArrayList<String>();
		String line = "";
		String requiredDataRow;
		int columnNumber = -1;
		int rowNumber = -1;
		String columnData = "";
		try {
			br = new BufferedReader(new FileReader(ASM_dataSheet));

			// Get Column Number
			String[] headers = br.readLine().split(ASM_dataSheetSeparator);
			for (int i = 0; i <= headers.length - 1; i++)
				if (headers[i].trim().equalsIgnoreCase(columnName))
					columnNumber = i;

			int rowIndex = 1;
			while ((line = br.readLine()) != null) {
				dataRows.add(line);
				if (line.split(ASM_dataSheetSeparator)[0]
						.equalsIgnoreCase(rowId))
					rowNumber = rowIndex;
				rowIndex++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		requiredDataRow = dataRows.get(rowNumber - 1);
		try {
			columnData = requiredDataRow.split(ASM_dataSheetSeparator)[columnNumber];
		} catch (ArrayIndexOutOfBoundsException ex) {
		}
		return columnData.replace("\\\"", "\"");
	}

	public static int getColumnNumber(String columnName) {
		String csvdatafilepath = getYamlValue("csv-data-file.path_OMA");
		String csvSeparator = getYamlValue("csv-data-file.data-separator");
		String firstCSVLine = csvReaderRowSpecific(csvdatafilepath, "false",
				"1");
		String[] arr = firstCSVLine.split(csvSeparator);
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i].trim().equalsIgnoreCase(columnName)) {
				return i;
			}
		}
		return -1;

	}

	public static int getColumnNumberForPriceValue(String columnName) {
		String csvdatafilepath = getYamlValue("csv-data-file.path_PriceValue");
		String csvSeparator = getYamlValue("csv-data-file.data-separator");
		String firstCSVLine = csvReaderRowSpecific(csvdatafilepath, "false",
				"1");
		String[] arr = firstCSVLine.split(csvSeparator);
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i].trim().equalsIgnoreCase(columnName)) {
				return i;
			}
		}
		return -1;

	}

	public String getSpecificColumnFromCsvLine(String csvLine,
			String csvSeparator, int columnNumber) {

		String returnStr = ""; // return blank if value / column not present
		try {
			returnStr = csvLine.split(csvSeparator)[columnNumber];
		} catch (ArrayIndexOutOfBoundsException ex) {
			// Reporter.log(
			// "Column Number "
			// + columnNumber
			// +
			// " in the data csv file is empty . Please check your test script OR keyword",
			// true);
		}

		return returnStr;
	}

	public DataProvider() {
	}
	
	public static String readProperty(String property) {
        InputStream inPropFile = null;
        try {
            inPropFile = new FileInputStream(new File(filePath));
            properties.load(inPropFile);
        } catch (IOException e) {
        	System.out.println("There was Exception reading the Test data");
        }
        String value = properties.getProperty(property);
        return value;
    }
	
	 public static void writeToFile(String property, String value)  {
			try {
				InputStream inPropFile = new FileInputStream(filePath);
				properties.load(inPropFile);
				inPropFile.close();
				OutputStream outPropFile = new FileOutputStream(filePath);
				properties.setProperty(property, value);
				properties.store(outPropFile, null);
				outPropFile.close();
			} catch (IOException e) {
				System.out.println("Unable to write value in property file");
				e.printStackTrace();
			}
			}
}
