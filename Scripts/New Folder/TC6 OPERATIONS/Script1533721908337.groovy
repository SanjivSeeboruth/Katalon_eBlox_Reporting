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

WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Menu-Mes rapports/TC Verify Mes rapports tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'REG BEWERKINGEN')

WebUI.click(findTestObject('Page_eBlox Reporting/Search_Icon'))

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/select report'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Definition'))

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Contenu'))

WebUI.waitForPageLoad(10)

WebUI.verifyTextPresent('Naam werknemer', true)

WebUiBuiltInKeywords.verifyTextPresent('Brutoloon ', true)

WebUI.click(findTestObject('Page_eBlox Rapportering/Operations'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Nouvelle operation'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Operation - Nom'), 'test')

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Operation -Description'), 'test')

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - Sauvegarder button'))

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Operation - Nom'), 'Bewerking 1')

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Operation -Description'), 'Brutoloon + Bedrag Toeslag 1')

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Formula 1'))

WebUiBuiltInKeywords.setText(findTestObject('Page_eBlox Rapportering/Operation/Fomula 1 input text'), 'Brutoloon')

WebUiBuiltInKeywords.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Fomula 1 input text'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Formula 2'))

WebUiBuiltInKeywords.setText(findTestObject('Page_eBlox Rapportering/Operation/Formula 2 input text'), 'Bedrag Toeslag 1')

WebUiBuiltInKeywords.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Formula 2 input text'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - Sauvegarder button'))

