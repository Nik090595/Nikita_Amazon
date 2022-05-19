package com.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getExcelsheetData(int row, int cell, String Filename) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream ("C:\\Users\\Nikita\\Documents\\New_Eclipse_Workspace\\Amazon\\src\\test\\resources\\Input.xlsx");
		String Value = WorkbookFactory.create(file).getSheet(Filename).getRow(row).getCell(cell).getStringCellValue();
		return Value;
	}
}
