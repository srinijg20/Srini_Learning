/**
 * 
 */
package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author srinipriya
 * Reusable functions for excels
 *
 */
public class Excel_Functions 

{
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public Excel_Functions(String excel_path)
	{
		try {
			File src=new File(excel_path);
			
			FileInputStream fis=new FileInputStream(src);
			
			 wb=new XSSFWorkbook(fis);
			
			 
		}  catch (Exception  e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
		public String Excel_data(int sheet,int row_no,int col_no)
		
		{
			sheet1=wb.getSheetAt(sheet);
			String values=sheet1.getRow(row_no).getCell(col_no).getStringCellValue();
			//System.out.println("the excel values are "+values);
			return values;
			
			
		}
		
	}
	
	
	

