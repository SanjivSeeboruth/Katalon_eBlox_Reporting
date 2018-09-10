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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

CustomKeywords.'verify_Test_Case_Number.getTestCaseNumber.getTCNo'()

WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Nouveau rapport button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - BASE DE RAPPORT/TC Verify radio button creer un tout nouveau rapport'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - CONTENU/TC Verify input field - Contenu'), 
    [('WaitPageToLoad') : GlobalVariable.TimeToWait], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Dossier_and_Groupe_options/TC Click on Dossier and Groupe downdrop'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Dossier_and_Groupe_options/TC Choose option figure dans'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Travailleur_options/TC Click on Travailleur downdrop'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Travailleur_options/TC Choose option figure dans'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Travailleur_options/TC Select option to choose travailleur'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Travailleur_options/TC Click on travailleur list option'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Travailleur_options/TC Click on travailleur textfield'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Travailleur_options/TC Select travailleur from dropdown'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/CheckBox Selection/TC Verify CheckBox'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - EXECUTION/Saisissez les valeurs souhaitees section/TC Click on Dossier and Groupe textfield'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - EXECUTION/Saisissez les valeurs souhaitees section/TC Select Dossier and groupe from dropdown'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Read data in table test'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - EXECUTION/Valeurs a indiquer/TC Select ref date'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - EXECUTION/Historique section/TC Verify Historic checkbox is checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - EXECUTION/Historique section/TC Click on historic period dropdown'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - EXECUTION/Historique section/TC Select historic period from dropdown'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Executer button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Sub Script/Verify Error Message/TC Verify Error message 1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Graphique button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.callTestCase(findTestCase('Sub Script/Verify Error Message/TC Verify Error message 2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/TC Verify annuler button'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/TC Verify Annuler nouveau rapport button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(25)

WebUI.closeBrowser()

