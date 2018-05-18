package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	private static XSSFWorkbook wBook;
	private static XSSFSheet sheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	public static void setExcelPath(String sheetName,String path) throws Exception
	{
		FileInputStream fis= new FileInputStream(path);
		wBook =new XSSFWorkbook(fis);
		sheet =wBook.getSheet(sheetName);
			
	}
	public static String getCellData(int rownum ,int colnum) {
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		String cellStringData=cell.getStringCellValue();
		return cellStringData;
	}
	public static String[][] getExcelTable(){
		int rowcount =sheet.getLastRowNum();
		int col =2;
		
		String[][] table= new String[rowcount][col];
				for(int i=0;i<rowcount;i++ )
				{
					for(int j=0;j<col;j++)
					{
						System.out.print(j);
						table[i][j]=getCellData(i,j);
					}
				}
				
				/*for(int i=0;i<rowcount;i++ )
				{
					for(int j=0;j<col;j++)
					{
System.out.println(table[i][j]);					}
				}*/
		return table;
	}
	public static void setExcelCell(int rownum,int column,String cellData) throws Exception{
		row=sheet.getRow(rownum);
		cell=row.getCell(column,MissingCellPolicy.RETURN_BLANK_AS_NULL);
		if (cell==null)
		{
			cell=row.createCell(column);
			cell.setCellValue(cellData);
		}
		else
		{
			cell.setCellValue(cellData);
		}
		FileOutputStream fso= new FileOutputStream("C:\\Nikhil\\TestData.xlsx");
				wBook.write(fso);
				fso.flush();
				fso.close();
				
	}
	
	
	}
	

