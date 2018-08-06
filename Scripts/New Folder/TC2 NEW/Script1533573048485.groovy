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

WebUI.waitForPageLoad(90)

WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Verify Nouveau rapport button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - BASE DE RAPPORT/TC1  Verify radio button creer un tout nouveau rapport - Copy'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - CONTENU/TC Verify input field'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is checked/TC 2 VErify Dossier and Groupe checkBox  is checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mes rapports Obj/SELECTION/Dossier and Groupe/click on Dossier and groupe dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/SELECTION/Dossier and Groupe/figure dans'))

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is checked/TC 3 Verify Travailleur checkBox  is checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mes rapports Obj/SELECTION/Travailleur/Click on Travailleur dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/SELECTION/Travailleur/figure dans'))

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 1 Verify Contrats actifs checkbox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 4 Verify Departement checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 5 Verify Caractere juridique du contract checBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 6 Verify Pays de naissance checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 7 Verify Sexe checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 8 Verify Mode de remuneration checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

