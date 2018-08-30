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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC Input text in search textfield'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC VErify Search icon'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC Select report name'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/TC Verify Definition tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Inner_Content/Content_Navigation/TC Verify Selection tab'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Selection etendue/TC Click on the plus icon'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Selection etendue/TC Input rubrique 1'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Selection etendue/TC Comparaison 1'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Selection etendue/TC Input Valeur'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Conditions - Nom - plus icon'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), 'Geboortedatum')

WebUI.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Dropdown criteria for condition'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Selection Etendue/est plus petit que - is kleiner dan'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Selection Etendue/Select date option'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Selection Etendue/Select date'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_eBlox Rapportering/Selection Etendue/Input date'), '01/01/1990 ')

WebUI.sendKeys(findTestObject('Page_eBlox Rapportering/Selection Etendue/Input date'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - Sauvegarder button'))

WebUI.click(findTestObject('Page_eBlox Rapportering/Selection Etendue/Execute tab button'))

def newId = WebUI.executeJavaScript('return $("input[type="text""]").attr("id")', [])

println(newId)

WebUI.closeBrowser()

