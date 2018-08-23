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

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main Page/TC Verify Mes rapports tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'REG HIST GROEP')

WebUI.click(findTestObject('Page_eBlox Reporting/Search_Icon'))

def myTestObject = new TestObject('Select_report')

myTestObject.addProperty('xpath', ConditionType.EQUALS, '//a[@class=\'hide-on-hover\']//span[@text=\'REG HIST GROEP\']')

WebUI.click(myTestObject)

WebUI.waitForPageLoad(10)

def myDonneeCalculees1 = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Berekende gegevens - looncode komt voor in'), 
    'id', 'contains', 's2id_autogen', true)

def myDonneeCalculees2 = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Berekende gegevens - looncode komt voor in'), 
    'id', 'contains', 's2id_autogen', true)

WebUI.click(myDonneeCalculees1)

def myDonneeCalculees = new TestObject('Select_donnee')

myDonneeCalculees.addProperty('xpath', ConditionType.EQUALS, '//div[@id=\'select2-drop\']//ul[@class=\'select2-results\']//li[@role=\'presentation\']//div[contains(text(),\'(alle looncodes)\')]')

WebUI.click(myDonneeCalculees)

//WebUI.sendKeys(myDonneeCalculees2, Keys.chord(Keys.ESCAPE))
WebUI.click(findTestObject('Mes rapports Obj/SELECTION/Travailleur/Page_eBlox Reporting/New Test Object'))

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUI.delay(5)

WebUI.closeBrowser()

