package com.test.NIMS.data_provider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.test.NIMS.base.NIMSBase;

public class BaseProvider extends NIMSBase{
   
	public static File file;
	public static FileInputStream inputStream;
	public static String[][] data;
	public static XSSFWorkbook workBook;
	public static XSSFSheet sheet;
	public static int rowCount;
	public static int coloumnCount;
	
	//we can specify to whomever will use the BaseProvider
	public static int sheetIndex;
	
	
	public static Object[][] readExcel() throws IOException
	{
	    file = new File("C:\\Users\\Vuyo\\Documents\\Neo\\SOWWorkhead.xlsx");
	    inputStream = new FileInputStream(file);
	    workBook = new XSSFWorkbook(inputStream);
        sheet = workBook.getSheetAt(sheetIndex);
        
        rowCount = sheet.getPhysicalNumberOfRows();
        coloumnCount = sheet.getRow(0).getLastCellNum();
        data = new String[rowCount][coloumnCount];
        System.out.println(rowCount);
        System.out.println(coloumnCount);
         
        for (int i = 1; i < rowCount;i++) {
		   
        	for (int j = 0; j < coloumnCount; j++) {
				 
        		String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
        		System.out.println(cellValue);
        		data[ i -1 ][j] = cellValue;
        		
        		
			}
		}
        
        inputStream.close();
        workBook.close();
        return data;
       	
		
	}

}
