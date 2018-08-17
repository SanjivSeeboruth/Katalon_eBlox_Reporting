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

WebUI.waitForPageLoad(90)

WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Verify Nouveau rapport button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Mes rapports/Mes rapports - BASE DE RAPPORT/TC1  Verify radio button creer un tout nouveau rapport'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

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

WebUiBuiltInKeywords.click(findTestObject('Mes rapports Obj/SELECTION/Travailleur/Select option to choose travailleur'))

WebUiBuiltInKeywords.click(findTestObject('Mes rapports Obj/SELECTION/Travailleur/travail - list option'))

def inputWorker = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/SELECTION/Travailleur/Input field for travailleur'), 
    'id', 'contains', 's2id_autogen', true)

WebUI.click(inputWorker)

def myTestObject = new TestObject('Select_travailleur_by_name')

myTestObject.addProperty('xpath', ConditionType.EQUALS, '//div[@id=\'select2-drop\']//ul[@class=\'select2-results\']//li[@role=\'presentation\']//div[contains(text(),\'0000013 - SIHAPAN GNA PHOUANGPHANH - 1AF0273 - ANTILOPE KARTONNAGE\')]')

WebUI.click(myTestObject)

WebUI.doubleClick(findTestObject(inputWorker))

/*def inputWorkerEsc = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/SELECTION/Travailleur/testEsc'), 'id', 
    'contains', 's2id_autogen', true)

WebUI.click(inputWorkerEsc)*/
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

WebUI.waitForPageLoad(10)

def inputDossier = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Description_Dossier and Groupe figure dans'), 
    'id', 'contains', 's2id_autogen', true)

WebUI.click(inputDossier)

def myInputDossier = new TestObject('Select_dossier_by_name')

myInputDossier.addProperty('xpath', ConditionType.EQUALS, '//div[@id=\'select2-drop\']//ul[@class=\'select2-results\']//li[@role=\'presentation\']//div[contains(text(),\'1AA0221 - 01 - DRUKKERIJ ANTILOPE NV\')]')

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Description _Date de reference historique'))

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Description_Date de reference historique - Dernier jour mois precedent'))

WebUI.check(findTestObject('Mes rapports Obj/EXECUTION/HIstorique- checkbox'))

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Historique_Period_dropdown'))

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Historique_Period - Dernier 12 mois'))

WebUI.callTestCase(findTestCase('Verify URL/TC Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Graphique button'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Montrer button'))

WebUI.verifyAlertPresent(10)

WebUI.acceptAlert()

WebUI.getAlertText()

println(WebUI.getAlertText())

WebUI.closeBrowser()

