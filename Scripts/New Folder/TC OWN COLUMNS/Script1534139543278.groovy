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

WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'REG EIGEN RUBRIEK')

WebUI.click(findTestObject('Page_eBlox Reporting/Search_Icon'))

def myTestObject = new TestObject('Select_report')

myTestObject.addProperty('xpath', ConditionType, '//span[@text=\'REG EIGEN RUBRIEK\']')

WebUI.click(myTestObject)

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Description _Date de reference historique'))

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Description_Date de reference historique - Dernier jour mois precedent'))

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

