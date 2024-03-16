package Basic_DDT;

import java.io.IOException;

import CommonUtils.ExcelUtils;
import CommonUtils.PropertyFileUtils;

public class PropertyFileCall {

	public static void main(String[] args) throws IOException {

		ExcelUtils eu = new ExcelUtils();
		PropertyFileUtils pu = new PropertyFileUtils();

		String input = eu.getDataFromExcel("Contacts", 1, 1);
		System.out.println(input);

		String v = pu.getDataFromPropertyFile("Url");
		System.out.println(v);

	}

}
