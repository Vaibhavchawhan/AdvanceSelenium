package Basic_DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel_Skillrary {

	public static void main(String[] args) throws IOException {

		// Step1: create Object of FileInputStream class & In FileInputStream enter the path location
		// --> add the args-->copy the path entile the src properties file
		FileInputStream fis = new FileInputStream("src\\test\\resources\\SkillraryPropertiesExel.xlsx");

		// step2: Call WorkbookFactory class from apache poi Family & call create(input stream)--> store varible (workbook)
		Workbook wb = WorkbookFactory.create(fis);

		// step3: Call getSheet(String name) & -> enter sheet name
		Sheet sh = wb.getSheet("SkilraryLogin");

		// Step4: Call getRow(int num ) & enter the row number
		Row rw = sh.getRow(1);

		// Step5: call getCell(int cell)
		Cell cl = rw.getCell(1);

		// step6: call getStringVCellValue()
		String data = cl.getStringCellValue();
		System.out.println(data);

	}

}
