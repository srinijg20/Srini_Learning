package com.testing.xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lib.Excel_Functions;

public class Testing_xls {

	public static void main(String[] args) 
	{
		Excel_Functions excel1=new Excel_Functions("C:\\Users\\srinipriya\\Desktop\\WeeklyStatusReport_Srini.xlsx");
		
		String data1=excel1.Excel_data(1, 0, 0);
		
		System.out.println("the excel values are "+data1);
		
		
		
		
		

	}

}
