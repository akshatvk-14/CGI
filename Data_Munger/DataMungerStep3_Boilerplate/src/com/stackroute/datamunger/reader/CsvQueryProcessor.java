package com.stackroute.datamunger.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;

import com.stackroute.datamunger.query.DataTypeDefinitions;
import com.stackroute.datamunger.query.Header;

public class CsvQueryProcessor extends QueryProcessingEngine {

	// Parameterized constructor to initialize filename
	private String fileName;

	public CsvQueryProcessor(String fileName) throws FileNotFoundException {
		try {
			new FileReader(fileName);
			this.fileName = fileName;
		}catch(FileNotFoundException e) {
			throw e;
		}
		
	}

	/*
	 * Implementation of getHeader() method. We will have to extract the headers
	 * from the first line of the file. Note: Return type of the method will be
	 * Header
	 */

	@Override
	public Header getHeader() throws IOException {

		// read the first line
		BufferedReader read = new BufferedReader(new FileReader(fileName));
		String headerLine = read.readLine();
		read.close();
		// populate the header object with the String array containing the header names
		return new Header(headerLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1));
	}

	/**
	 * getDataRow() method will be used in the upcoming assignments
	 */

	@Override
	public void getDataRow() {

	}

	/*
	 * Implementation of getColumnType() method. To find out the data types, we will
	 * read the first line from the file and extract the field values from it. If a
	 * specific field value can be converted to Integer, the data type of that field
	 * will contain "java.lang.Integer", otherwise if it can be converted to Double,
	 * then the data type of that field will contain "java.lang.Double", otherwise,
	 * the field is to be treated as String. Note: Return Type of the method will be
	 * DataTypeDefinitions
	 */

	@Override
	public DataTypeDefinitions getColumnType() throws IOException {
		BufferedReader read = new BufferedReader(new FileReader(fileName));
		String headerLine = read.readLine(); // Header line
		int headLen = headerLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1).length;
		String valuesLine = read.readLine();
		String[] values = valuesLine.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
		String[] dataTypes = new String[headLen];
		for (int i = 0; i < values.length; i++) {
			if(values[i].equals("")) {
				dataTypes[i] = "java.lang.String";
			}
			try {
				Integer.parseInt(values[i]);
				dataTypes[i] = "java.lang.Integer";
			} catch (NumberFormatException e) {
				try {
					Double.parseDouble(values[i]);
					dataTypes[i] = "java.lang.Double";
				} catch (NumberFormatException ee) {
					dataTypes[i] = "java.lang.String";
				}
			}
		} 
	
		read.close();
		return new DataTypeDefinitions(dataTypes);
	}
}




//package com.stackroute.datamunger.reader;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import com.stackroute.datamunger.query.DataTypeDefinitions;
//import com.stackroute.datamunger.query.Header;
//
//public class CsvQueryProcessor extends QueryProcessingEngine {
//
//	// Parameterized constructor to initialize filename
//	public CsvQueryProcessor(String fileName) throws FileNotFoundException {
//
//	}
//
//	/*
//	 * Implementation of getHeader() method. We will have to extract the headers
//	 * from the first line of the file.
//	 * Note: Return type of the method will be Header
//	 */
//	
//	@Override
//	public Header getHeader() throws IOException {
//
//		// read the first line
//
//		// populate the header object with the String array containing the header names
//		return null;
//	}
//
//	/**
//	 * getDataRow() method will be used in the upcoming assignments
//	 */
//	
//	@Override
//	public void getDataRow() {
//
//	}
//
//	/*
//	 * Implementation of getColumnType() method. To find out the data types, we will
//	 * read the first line from the file and extract the field values from it. If a
//	 * specific field value can be converted to Integer, the data type of that field
//	 * will contain "java.lang.Integer", otherwise if it can be converted to Double,
//	 * then the data type of that field will contain "java.lang.Double", otherwise,
//	 * the field is to be treated as String. 
//	 * Note: Return Type of the method will be DataTypeDefinitions
//	 */
//	
//	@Override
//	public DataTypeDefinitions getColumnType() throws IOException {
//
//		return null;
//	}
//}
