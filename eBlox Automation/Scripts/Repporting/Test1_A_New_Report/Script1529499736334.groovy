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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.acc.sdworx.com/portalmysd/be/en')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_mysdworx - Log in/input_Username'), 'DP_EBLOX_RPP_VASCO')

WebUI.setText(findTestObject('Page_mysdworx - Log in/input_Password'), '200882')

'Login to mySDWorx'
WebUI.click(findTestObject('Page_mysdworx - Log in/button_Log in'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_eBlox Reporting/a_eBlox Rapportage'))

WebUI.switchToWindowTitle('eBlox Reporting')

WebUI.waitForPageLoad(5)

'Go to eBlox Reporting Page'
WebUI.click(findTestObject('Page_eBlox Reporting/a_Mes rapports'))

'Create a new report'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Nouveau rapport'))

'Go to Contenu tab'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Next_Arrow'))

WebUI.waitForPageLoad(5)

'Select contents to be appeared in report'
WebUI.setText(findTestObject('Page_eBlox Reporting/input_Text'), 'Travailleur')

WebUI.click(findTestObject('Page_eBlox Reporting/select_Nom travailleur'))

WebUI.click(findTestObject('Page_eBlox Reporting/i_fa fa-times'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_eBlox Reporting/input_Text'), 'Departement')

WebUI.click(findTestObject('Page_eBlox Reporting/select_Departement'))

WebUI.click(findTestObject('Page_eBlox Reporting/i_fa fa-times'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_eBlox Reporting/input_Text'), 'Date d\'entree')

WebUI.click(findTestObject('Page_eBlox Reporting/select_Date dentre'))

WebUI.click(findTestObject('Page_eBlox Reporting/i_fa fa-times'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_eBlox Reporting/input_Text'), 'sexe')

WebUI.click(findTestObject('Page_eBlox Reporting/select_Sexe'))

WebUI.click(findTestObject('Page_eBlox Reporting/i_fa fa-times'), FailureHandling.STOP_ON_FAILURE)

'Go to Selection tab'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Selection'))

WebUI.waitForPageLoad(5)

WebUI.uncheck(findTestObject('Page_eBlox Reporting/checkbox_Contrats'))

WebUI.uncheck(findTestObject('Page_eBlox Reporting/checkbox_Dossier'))

'Go to Execution tab'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Selection'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementPresent(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Properties'), 1)

WebUI.waitForElementVisible(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Properties'), 2)

'Go to Proprietes tab'
WebUI.click(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Properties', [('variable') : '']))

WebUI.waitForPageLoad(10)

WebUI.waitForElementVisible(findTestObject('Page_eBlox Reporting/button_Next_Arrow_Properties'), 2)

WebUI.setText(findTestObject('Page_eBlox Reporting/input_Dossier_Name'), 'Boss1')

WebUI.click(findTestObject('Page_eBlox Reporting/click_DropDown_Menu_arrow'))

WebUI.setText(findTestObject('Page_eBlox Reporting/input_Folder_Name'), 'Sanjiv')

WebUI.sendKeys(findTestObject('Page_eBlox Reporting/input_Folder_Name'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Reporting/button_Sauvegarder'))

WebUI.click(findTestObject('Page_eBlox Reporting/button_Vers Mes rapports'))

WebUI.click(findTestObject('Page_eBlox Reporting/select_FolderName'))

WebUI.verifyTextPresent('Boss1', false)

not_run: WebUI.closeBrowser()

