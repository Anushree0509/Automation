package framework;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoA {

	public static void main(String[] args) throws Exception {
		
		Workbook w = WorkbookFactory.create(new File("./data/Book1.xlsx"));
		String s = getSheet("sheet1").getRow(0).getCell(0).toString();
		System.out.println(s);

	}

}
