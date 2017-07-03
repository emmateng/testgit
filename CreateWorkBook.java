package poi;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateWorkBook {
	private static XSSFWorkbook workbook;

	public static void main(String[] args)throws Exception 
	   {
	      workbook = new XSSFWorkbook(); 
	      //Create file system using specific name
	      FileOutputStream out = new FileOutputStream(
	      new File("createworkbook.xlsx"));
	      //write operation workbook using file out object 
	      workbook.write(out);
	      out.close();
	      System.out.println(
	      "createworkbook.xlsx written successfully");
	   }

}
