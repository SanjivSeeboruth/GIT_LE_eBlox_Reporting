package com.save.report

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.google.common.collect.FilteredEntryMultimap.Keys
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class SaveReport {
	
	@Keyword
	public void selectionForReport(String fileName) {

		TestData excelData = findTestData(fileName)
		
		WebUI.waitForPageLoad(5)
		
		WebUI.sendKeys(findTestObject('Page_eBlox Reporting/'+ excelData.getValue("Object", 16)), excelData.getValue("Input", 16))
			
		WebUI.click(findTestObject('Page_eBlox Reporting/'+ excelData.getValue("Object", 17)))
		
		WebUI.setText(findTestObject('Page_eBlox Reporting/'+ excelData.getValue("Object", 18)), excelData.getValue("Input", 18))
		
		WebUI.sendKeys(findTestObject('Page_eBlox Reporting/' + excelData.getValue("Object", 18)), Keys.chord(Keys.ENTER))
		
		WebUI.click(findTestObject('Page_eBlox Reporting/'+ excelData.getValue("Object", 19)))
		
}
	
}
