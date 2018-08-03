package com.reporting.login

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

public class LoginReporting {

	@Keyword
	public void loginIntoApplication(String fileName) {


		TestData excelData = findTestData(fileName)

		WebUI.openBrowser(excelData.getValue("WebUrl", 1))
		WebUI.waitForPageLoad(1)
		WebUI.maximizeWindow()

		WebUI.sendKeys(findTestObject('Page_mysdworx - Log in/input_Username'), excelData.getValue("Username", 1))
		WebUI.sendKeys(findTestObject('Page_mysdworx - Log in/input_Password'), excelData.getValue("Password", 1))
		WebUI.click(findTestObject('Page_mysdworx - Log in/button_Log in'))

		WebUI.click(findTestObject('Page_eBlox Reporting/a_eBlox Rapportage'))
		WebUI.switchToWindowTitle('eBlox Reporting')

		WebUI.waitForPageLoad(5)
	}
}
