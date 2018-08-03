
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.select.contents.ContentSelections.selectContents"(
    	String fileName	) {
    (new com.select.contents.ContentSelections()).selectContents(
        	fileName)
}

def static "com.helper.excel.ExcelHelper.writeTOExcelFile"(
    	String excelPath	
     , 	String sheetName	
     , 	String value	
     , 	int rowNo	
     , 	int colNo	) {
    (new com.helper.excel.ExcelHelper()).writeTOExcelFile(
        	excelPath
         , 	sheetName
         , 	value
         , 	rowNo
         , 	colNo)
}

def static "com.reporting.login.LoginReporting.loginIntoApplication"(
    	String fileName	) {
    (new com.reporting.login.LoginReporting()).loginIntoApplication(
        	fileName)
}

def static "com.selection.select.MakeSelection.selectionForReport"(
    	String fileName	) {
    (new com.selection.select.MakeSelection()).selectionForReport(
        	fileName)
}

def static "com.save.report.SaveReport.selectionForReport"(
    	String fileName	) {
    (new com.save.report.SaveReport()).selectionForReport(
        	fileName)
}
