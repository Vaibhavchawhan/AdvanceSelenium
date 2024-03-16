package Basic_DDT;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import CommonUtils.ExcelUtils;

//To Call the data Excel sheet--> 
public class ExcelUtilCall {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		ExcelUtils eu= new ExcelUtils();
		String a = eu.getDataFromExcel("SkilraryLogin", 0, 0);
		System.out.println(a);

	}

}
