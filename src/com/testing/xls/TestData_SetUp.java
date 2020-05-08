package com.testing.xls;

import lib.Read_TestData;

/**
 * @author srinipriya
 *
 */
public class TestData_SetUp 
{
	public static void main(String[] args) throws Throwable 
	{
		Read_TestData Data1=new Read_TestData("C:\\Users\\srinipriya\\eclipse-workspace\\JavaLearning\\Test_Data\\Test_Data.xlsx");
		Object Username=Data1.fnReadData("Test_Data", "TS_TC01","User_Name");
		Object Username1=Data1.fnReadData("Test_Data", "TS_TC02","User_Name");
		Object Username2=Data1.fnReadData("Test_Data", "TS_TC02","Age");
	}
}

