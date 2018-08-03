package com.select.contents

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class ContentSelections {

	@Keyword
	public void selectContents(String fileName) {

		TestData excelData = findTestData(fileName)

		'Select contents to be appeared in report'
		WebUI.sendKeys(findTestObject('Page_eBlox Reporting/input_Text'), excelData.getValue("Input", 6))
		WebUI.click(findTestObject('Page_eBlox Reporting/'+ excelData.getValue("Object", 6) ))

		WebUI.click(findTestObject('Page_eBlox Reporting/i_fa fa-times'), FailureHandling.STOP_ON_FAILURE)

		WebUI.sendKeys(findTestObject('Page_eBlox Reporting/input_Text'), excelData.getValue("Input", 7))
		WebUI.click(findTestObject('Page_eBlox Reporting/'+ excelData.getValue("Object", 7) ))

		WebUI.click(findTestObject('Page_eBlox Reporting/i_fa fa-times'), FailureHandling.STOP_ON_FAILURE)

		WebUI.sendKeys(findTestObject('Page_eBlox Reporting/input_Text'), excelData.getValue("Input", 8))
		WebUI.click(findTestObject('Page_eBlox Reporting/'+ excelData.getValue("Object", 8) ))

		WebUI.click(findTestObject('Page_eBlox Reporting/i_fa fa-times'), FailureHandling.STOP_ON_FAILURE)

		WebUI.sendKeys(findTestObject('Page_eBlox Reporting/input_Text'), excelData.getValue("Input", 9))
		WebUI.click(findTestObject('Page_eBlox Reporting/'+ excelData.getValue("Object", 9) ))
	}
}
