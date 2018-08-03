import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.acc.sdworx.com/portalmysd/be/en')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Page_mysdworx - Log in/input_Username'), 'DP_EBLOX_RPP_VASCO')

WebUI.setText(findTestObject('Page_mysdworx - Log in/input_Password'), '886729')

WebUI.delay(1)

ui_variable = WebUI.getAttribute(findTestObject('Page_mysdworx - Log in/input_Username'), 'value')

System.out.println(ui_variable)

CustomKeywords.'com.helper.excel.ExcelHelper.writeTOExcelFile'('C:\\Users\\seeboruts\\OneDrive - SD Worx\\Desktop\\eBlox Automation\\ExcelFiles\\test.xlsx', 
    'TestData', ui_variable, 1, 1)

WebUI.delay(1)

