import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.google.common.collect.FilteredEntryMultimap.Keys as Keys
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

WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.click(findTestObject('Mes rapports Obj/New button dropdown'))

WebUI.click(findTestObject('Mes rapports Obj/intern option'))

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - BASE DE RAPPORT/TC1  Verify radio button creer un tout nouveau rapport'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - CONTENU/TC Verify input field INTERNAL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 10 Deselect all checkbox'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Mes rapports Obj/PROPRIETES/Generalites - input name'), 10)

WebUI.setText(findTestObject('Mes rapports Obj/PROPRIETES/Generalites - input name'), 'TEST REG IPS 12.08.2018')

WebUI.click(findTestObject('Page_eBlox Reporting/click_DropDown_Menu_arrow'))

def Foldername = WebUI.modifyObjectProperty(findTestObject('Page_eBlox Reporting/input_Folder_Name'), 'id', 'contains', 
    's2id_autogen', true)

WebUI.setText(Foldername, 'TEST REG IPS DATUM')

/*WebUI.setText(findTestObject('Page_eBlox Reporting/input_Folder_Name'), 'Sanjiv')*/
/*WebUI.sendKeys(findTestObject('Page_eBlox Reporting/input_Folder_Name'), Keys.chord(Keys.ENTER))*/
WebUI.sendKeys(Foldername, Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Reporting/button_Sauvegarder'))

not_run: WebUI.click(findTestObject('Page_eBlox Reporting/button_Vers Mes rapports'))

not_run: WebUI.click(findTestObject('Page_eBlox Reporting/select_FolderName'))

