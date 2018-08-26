import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Mes rapports tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'TEST 2 MAU JAN 2018 (sanjiv)')

WebUI.click(findTestObject('Page_eBlox Reporting/Search_Icon'))

def myTestObject = new TestObject('Select_report_name')

myTestObject.addProperty('xpath', ConditionType.EQUALS, '//a[@class=\'hide-on-hover\']//span[@text=\'TEST 2 MAU JAN 2018 (SANJIV)\']')

WebUI.click(myTestObject)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/TC Verify Definition tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC VErify Contenu tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC Verify Selection tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC Tableau croise tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC VErify Graphiques tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementText(findTestObject('Page_eBlox Rapportering/Graphique - Grafieken/text - Historisch uitvoeren'), 
    'Niet-historisch uitvoeren')

not_run: WebUI.verifyElementText(findTestObject('Page_eBlox Rapportering/Graphique - Grafieken/text - Historisch uitvoeren'), 
    'Historisch uitvoeren')

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC Verify Operations tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC Verify List button icon'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC VErify text in search textfield'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'TEST RAPPORT REGRESSIE')

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC VErify Search icon'), [:], 
    FailureHandling.STOP_ON_FAILURE)

def myTestObject1 = new TestObject('Select_report_name')

myTestObject1.addProperty('xpath', ConditionType.EQUALS, '//a[@class=\'hide-on-hover\']//span[@text=\'TEST RAPPORT REGRESSIE\']')

WebUI.click(myTestObject1)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - EXECUTION/Saisissez les valeurs souhaitees section/TC Click on reference historic dropdown'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - EXECUTION/Saisissez les valeurs souhaitees section/TC Select historic type from the dropdown'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Graphique button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC2 Verify FR Language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

