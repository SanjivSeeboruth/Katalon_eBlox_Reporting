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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'REG NEGATIEF')

WebUI.click(findTestObject('Page_eBlox Reporting/Search_Icon'))

def myTestObject = new TestObject('Select_report_NEGATIEF')

myTestObject.addProperty('xpath', ConditionType.EQUALS, '//a[@ui-sref=\'uitvoering.index({id:item.id})\']//span[@text=\'REG NEGATIEF\']')

WebUI.click(myTestObject)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.delay(2)

def historic = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Description _Date de reference historique'), 
    'xpath', 'contains', '//*[@id="uitvoering-parameters"]/div/div[2]/div/div/table/tbody/tr[2]/td[2]/div/div/rapp-date-prompt/div/div/rapp-special-values/div/button', 
    true)

WebUI.click(historic)

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Aujourdhui - Vandaag'))

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUI.waitForPageLoad(10)

WebUI.delay(10)

WebUI.closeBrowser()

