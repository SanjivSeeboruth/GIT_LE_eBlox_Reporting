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

'Login Reporting Page'
WebUI.callTestCase(findTestCase('Repporting/Login_eBlox_Reporting'), [:], FailureHandling.STOP_ON_FAILURE)

'Create a new report'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Nouveau rapport'))

'Go to Contenu tab'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Next_Arrow'))

WebUI.waitForPageLoad(5)

'Select contents to be appeared in report'
WebUI.callTestCase(findTestCase('Repporting/Select_Contents_For_New_Reports'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Selection'))

WebUI.waitForPageLoad(5)

'\'Go to Selection tab\''
WebUI.callTestCase(findTestCase('Repporting/Selection_For_Report'), [:], FailureHandling.STOP_ON_FAILURE)

'Go to Execution tab'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Execution'))

WebUI.waitForPageLoad(10)

'Go to Proprietes tab'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Properties', [('variable') : '', ('variable_0') : '']))

WebUI.waitForPageLoad(10)

'Save Report'
WebUI.callTestCase(findTestCase('Repporting/Save_Report'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_eBlox Reporting/button_Vers Mes rapports'))

WebUI.click(findTestObject('Page_eBlox Reporting/select_FolderName'))

not_run: WebUI.verifyTextPresent('Boss1', false)

