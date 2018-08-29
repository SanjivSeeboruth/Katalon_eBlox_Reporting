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

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Mes rapports tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC Input text in search textfield'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC VErify Search icon'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC Select report name'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/TC Verify Definition tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC VErify Contenu tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - CONTENU/TC Verify contenu in table'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC Verify Operations tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/Nouvelle Operation/TC Verify nouvelle operation dropdown button'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/Nouvelle Operation/TC Opearation numerique'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/Nouvelle Operation/TC Input nom d_operations'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/Nouvelle Operation/TC Input the operation description'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Sauvegarder button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Operation - Nom'), 'Bewerking 2')

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Operation -Description'), 'Brutoloon + Bedrag Toeslag 2')

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Formula 1'))

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Fomula 1 input text'), 'Brutoloon')

WebUI.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Fomula 1 input text'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Formula 2'))

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Formula 2 input text'), 'Bedrag Toeslag 1')

WebUI.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Formula 2 input text'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - Sauvegarder button'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Ajouter plus button operation'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - Conditon button'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - Nouvelle condition'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - input condition name'))

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Operation - input condition name'), 'Conditie Bewerking 1')

WebUI.closeBrowser()

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Conditions - Nom - plus icon'))

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), 'Brutoloon')

WebUI.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Dropdown criteria for condition'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Criteria - est inferieur a'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Criteria condition number'))

'not sending text'
WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Criteria condition number'), '800')

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - Sauvegarder button'))

