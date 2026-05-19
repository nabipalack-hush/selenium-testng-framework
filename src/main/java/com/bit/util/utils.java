package com.bit.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.BufferUnderflowException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.io.Files;


public class utils {
	static WebDriver driver;
 public	utils(WebDriver driver){
		this.driver=driver;
	}
 FileInputStream f;
 Object [][] obj;
 XSSFWorkbook book;
 XSSFSheet sheet;
 
 @DataProvider(name="datalogin")
public Object[][] readXL(File path) {
	//new File(System.getProperty("user.dir")+"/read.xlsx")
	try {
		 f=new FileInputStream(path);
		 book=new XSSFWorkbook(f);
		 sheet=book.getSheetAt(0);
		//String v= sheet.getRow(1).getCell(0).getStringCellValue();
		 int rowN=sheet.getLastRowNum();
		 int cellN=sheet.getRow(0).getLastCellNum();
		 obj=new Object[rowN][cellN];
		for(int i=1;i<rowN;i++) {
			for(int j=0;j<cellN;j++) {
				XSSFCell ce=sheet.getRow(i).getCell(j);
				switch(ce.getCellType()) {
				case XSSFCell.CELL_TYPE_NUMERIC:{
					System.out.println(ce.getNumericCellValue());
					obj[i-1][j]=ce.getNumericCellValue()
				}case XSSFCell.CELL_TYPE_STRING:{
					System.out.println(ce.getStringCellValue());
					obj[i-1][j]=ce.getStringCellValue()
				}
				}
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return obj;
}
 public void readFile() {
	 FileReader f=null;
	 BufferedReader bf=null;
	 try {
		 f=new FileReader(new File("/Users/bittechconsulting/eclipse-workspace/TestNGFramework21/book.txt"));
		 bf=new BufferedReader(f);
		 String line=bf.readLine();
		 while(line!=null) {
			 System.out.println(line);
			 line=bf.readLine();
		 }
		 //risky code
	 }catch(FileNotFoundException e1) {
		 e1.getMessage();
		 System.out.println("not found");
	 }catch(Exception e) {
		 
	 }finally {
		 if(bf!=null) {
			 try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("continue");
		 }
	 }
 }
 
 
 
	public static void getScreenshot() throws IOException {
		
		int x=(int)Math.random();
		TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                Files.copy(SrcFile, new File("/Users/bittechconsulting/eclipse-workspace/TestNGFramework21/screenShot/shot"+x+".png"));
	}
}
