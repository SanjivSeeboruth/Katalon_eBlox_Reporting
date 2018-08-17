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

WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Main Page/TC Verify Mes rapports tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'TEST 2 MAU JAN 2018 (sanjiv)')

WebUI.click(findTestObject('Page_eBlox Reporting/Search_Icon'))

def myTestObject = new TestObject('Select_report')

myTestObject.addProperty('xpath', ConditionType.EQUALS, '//a[@class=\'hide-on-hover\']//span[@text=\'test 2 mau jan 2018 (sanjiv)\']')

WebUI.click(myTestObject)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Definition'))

WebUI.waitForPageLoad(10)

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Contenu'))

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Selection'))

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Tableau croise'))

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Graphiques'))

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Niet-historisch uitvoeren', false)

WebUI.verifyTextPresent('Historisch uitvoeren', true)

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/Operations'))

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.click(findTestObject('Page_eBlox Rapportering/List button'))

result = WebUI.getText(findTestObject('Mes rapports Obj/input search filter'))

if (result == 'TEST 2 MAU JAN 2018 (sanjiv)') {
    KeywordUtil.markPassed('Text is still present')
}

WebUI.click(findTestObject('Mes rapports Obj/select report'))

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Historique_Period_dropdown'))

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Historique_Period - Dernier 12 mois'))

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Graphique button'))

WebUI.callTestCase(findTestCase('Select Language/TC2 Verify FR Language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()