package com.atmecs.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public File file;
	public FileInputStream stream;
	public XSSFWorkbook book;
	public XSSFSheet sheet;
	XSSFCell cell;
	public String readData(String path,String sheetName,int row,int column)
	{
		String data=null;
		try {
			 file=new File(path);
			
			stream=new FileInputStream(file);
			try {
				 book=new XSSFWorkbook(stream);
			} catch (IOException e) {
				e.printStackTrace();
			}
			sheet=book.getSheet(sheetName);
			cell = sheet.getRow(row).getCell(column);
			data = cell.toString();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return data;
		

	
	}

}
