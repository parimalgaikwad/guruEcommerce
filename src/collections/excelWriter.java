package collections;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelWriter {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstsheet");
		XSSFSheet sheet1 = workbook.createSheet("secondsheet");
		
		for (int row=5;row<20;row++) {
			
			Row r = sheet0.createRow(row);
			for(int cols=0; cols<20;cols++)
				
			{
				
				Cell a = r.createCell(cols);
				a.setCellValue((int)(Math.random()*100));
			}
			
			
		}
		
			
		File f = new File("C:\\Users\\Parimal\\Desktop\\firstexcel.xlsx");
		
		FileOutputStream fo = new 	FileOutputStream(f);
		
		workbook.write(fo);
		
		
		fo.close();

	}

}

