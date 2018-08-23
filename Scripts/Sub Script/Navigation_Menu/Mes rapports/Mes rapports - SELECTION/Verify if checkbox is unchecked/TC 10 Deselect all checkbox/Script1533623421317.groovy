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

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 1 Verify Contrats actifs checkbox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 2 VErify Dossier and Groupe checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 3 Verify Travailleur checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 4 Verify Departement checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 5 Verify Caractere juridique du contract checBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 6 Verify Pays de naissance checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 7 Verify Sexe checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 8 Verify Mode de remuneration checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Mes rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 9 Verify Suspension checkBox  is un-checked'), 
    [:], FailureHandling.STOP_ON_FAILURE)

