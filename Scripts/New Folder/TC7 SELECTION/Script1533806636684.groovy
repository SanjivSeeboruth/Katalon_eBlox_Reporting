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

WebUI.waitForPageLoad(50)

WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'REG SELECTIE')

not_run: WebUI.verifyTextPresent('REG SELECTIE', true)

WebUI.click(findTestObject('Mes rapports Obj/TESTING select a report'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Definition'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Selection'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Conditions - Nom - plus icon'))

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), 'Geslacht')

WebUiBuiltInKeywords.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), Keys.chord(
        Keys.ENTER))

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Operation/Dropdown criteria for condition'))

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Selection Etendue/est egale a - is gelijk aan'))

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Selection Etendue/Valeur - Man'))

WebUiBuiltInKeywords.setText(findTestObject('Page_eBlox Rapportering/Selection Etendue/Valeur - Man'), 'Man')

WebUiBuiltInKeywords.sendKeys(findTestObject('Page_eBlox Rapportering/Selection Etendue/Input Valeur'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Conditions - Nom - plus icon'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), 'Geboortedatum')

WebUiBuiltInKeywords.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), Keys.chord(
        Keys.ENTER))

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Operation/Dropdown criteria for condition'))

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Selection Etendue/est plus petit que - is kleiner dan'))

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Selection Etendue/Select date option'))

WebUiBuiltInKeywords.setText(findTestObject('Page_eBlox Rapportering/Selection Etendue/Valeur - Man'), 'Man')

WebUiBuiltInKeywords.sendKeys(findTestObject('Page_eBlox Rapportering/Selection Etendue/Input Valeur'), Keys.chord(Keys.ENTER))

