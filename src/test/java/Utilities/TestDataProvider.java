package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name="arrayValidcodeTopics")
	public Object[][] arrayValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("ArrayPageValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}
    
	@DataProvider(name="arrayInValidcodeTopics")
	public Object[][] arrayInValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("ArrayPageInValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}

    @DataProvider(name="graphValidcodeTopics")
	public Object[][] graphValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("GraphPageValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}
    
	@DataProvider(name="graphInValidcodeTopics")
	public Object[][] graphInValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("GraphPageInValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}

    @DataProvider(name="llValidcodeTopics")
	public Object[][] llValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("LinkedListPageValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}
    
	@DataProvider(name="llInValidcodeTopics")
	public Object[][] llInValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("LinkedListPageInValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}

    @DataProvider(name="queueValidcodeTopics")
	public Object[][] queueValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("QueuePageValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}
    
	@DataProvider(name="queueInValidcodeTopics")
	public Object[][] queueInValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("QueuePageInValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}

    @DataProvider(name="stackValidcodeTopics")
	public Object[][] stackValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("StackPageValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}
    
	@DataProvider(name="stackInValidcodeTopics")
	public Object[][] InValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("StackPageInValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}

    @DataProvider(name="treeValidcodeTopics")
	public Object[][] treeValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("TreePageValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}
    
	@DataProvider(name="treeInValidcodeTopics")
	public Object[][] treeInValidcodeTopics() throws IOException {
		File excelFile=new File("./src/test/resources/Excel/practiceCode.xlsx");
		FileInputStream fis=new FileInputStream(excelFile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheet("TreePageInValidCode");
		int Rowno=sheet.getPhysicalNumberOfRows();
		int Cellno=sheet.getRow(0).getLastCellNum();
		Object[][] topicValidcode=new Object[Rowno-1][Cellno]; 
		
		for(int i=0;i<Rowno-1;i++) {
			for(int j=0; j<Cellno; j++ ) {
				DataFormatter df=new DataFormatter();
				topicValidcode[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return topicValidcode;
	}

    @DataProvider(name = "pythonCodeRow0")
    public Object[][] provideCodeData_0() {
        return new Object[][] {
            {"pythonCode", 0},
        };
    }
    
    @DataProvider(name = "pythonCodeRow1")
    public Object[][] provideCodeData_1() {
        return new Object[][] {
            {"pythonCode", 1},
        };
    }
    
    @DataProvider(name = "pythonCodeRow2")
    public Object[][] provideCodeData_2() {
        return new Object[][] {
            {"pythonCode", 2},
        };
    }
    
    @DataProvider(name = "pythonCodeRow3")
    public Object[][] provideCodeData_3() {
        return new Object[][] {
            {"pythonCode", 3},
        };
    }
    
    @DataProvider(name = "pythonCodeRow4")
    public Object[][] provideCodeData_4() {
        return new Object[][] {
            {"pythonCode", 4},
        };
    }
    
    @DataProvider(name = "pythonCodeRow5")
    public Object[][] provideCodeData_5() {
        return new Object[][] {
            {"pythonCode", 4},
        };
    }
    
    @DataProvider(name = "pythonCodeRow6")
    public Object[][] provideCodeData_6() {
        return new Object[][] {
            {"pythonCode", 6},
        };
    }
    
    @DataProvider(name = "pythonCodeRow7")
    public Object[][] provideCodeData_7() {
        return new Object[][] {
            {"pythonCode", 7},
        };
    }
    
    @DataProvider(name = "loginRow0")
    public Object[][] loginData_0() {
        return new Object[][] {
            {"login", 0},
        };
    }
    
    @DataProvider(name = "loginRow1")
    public Object[][] loginData_1() {
        return new Object[][] {
            {"login", 1},
        };
    }
    
    @DataProvider(name = "loginRow2")
    public Object[][] loginData_2() {
        return new Object[][] {
            {"login", 2},
        };
    }
    
    @DataProvider(name = "loginRow3")
    public Object[][] loginData_3() {
        return new Object[][] {
            {"login", 3},
        };
    }
    
    @DataProvider(name = "loginRow4")
    public Object[][] loginData_4() {
        return new Object[][] {
            {"login", 4},
        };
    }
    
    @DataProvider(name = "loginRow5")
    public Object[][] loginData_5() {
        return new Object[][] {
            {"login", 5},
        };
    }
    
    @DataProvider(name = "RegisterRow1")
    public Object[][] RegisterData_1() {
        return new Object[][] {
            {"Register", 1},
        };
    }
    
    @DataProvider(name = "RegisterRow2")
    public Object[][] RegisterData_2() {
        return new Object[][] {
            {"Register", 2},
        };
    }
    
    @DataProvider(name = "RegisterRow3")
    public Object[][] RegisterData_3() {
        return new Object[][] {
            {"Register", 3},
        };
    }
    
    @DataProvider(name = "RegisterRow4")
    public Object[][] RegisterData_4() {
        return new Object[][] {
            {"Register", 4},
        };
    }
    
    @DataProvider(name = "RegisterRow5")
    public Object[][] RegisterData_5() {
        return new Object[][] {
            {"Register", 5},
        };
    }
    
    @DataProvider(name = "RegisterRow6")
    public Object[][] RegisterData_6() {
        return new Object[][] {
            {"Register", 6},
        };
    }
    
    @DataProvider(name = "RegisterRow7")
    public Object[][] RegisterData_7() {
        return new Object[][] {
            {"Register", 7},
        };
    }
    
    @DataProvider(name = "RegisterRow8")
    public Object[][] RegisterData_8() {
        return new Object[][] {
            {"Register", 8},
        };
    }

}
