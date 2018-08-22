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

WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Mes rapports/Main Page/TC Verify Mes rapports tab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Mes rapports Obj/input search filter'), 'REG EXPORT')

WebUI.click(findTestObject('Page_eBlox Reporting/Search_Icon'))

def myTestObject = new TestObject('Select_report')

myTestObject.addProperty('xpath', ConditionType.EQUALS, '//a[@class=\'hide-on-hover\']//span[@text=\'REG EXPORT\']')

WebUI.click(myTestObject)

WebUI.waitForPageLoad(10)

WebUI.waitForElementClickable(findTestObject('Page_eBlox Rapportering/Definition'), 15)

def definition = WebUI.modifyObjectProperty(findTestObject('Page_eBlox Rapportering/Definition'), 'xpath', 'contains', '//a[contains(text(),\'Definitie\')]', 
    true)

WebUI.click(definition)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Proprietes'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementClickable(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Contenu checkbox'), 
    2)

WebUI.verifyElementChecked(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Contenu checkbox'), 
    2)

WebUI.verifyElementChecked(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Graphiques - propres graphiques checkbox'), 
    2)

WebUI.verifyElementChecked(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Graphiques - suggestions SD checkbox'), 
    2)

WebUI.verifyElementChecked(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Tableau croise checkbox'), 
    2)

WebUI.click(findTestObject('Page_eBlox Rapportering/Execution tab'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementClickable(findTestObject('Mes rapports Obj/EXECUTION/Description _Date de reference historique'), 10)

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Description _Date de reference historique'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Mes rapports Obj/EXECUTION/Aujourdhui - Vandaag'), 5)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Aujourdhui - Vandaag'))

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Periode de paiement - Betaalperiode'))

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Periode de paiement - Betaalperiode - Huidig jaar'))

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUI.waitForPageLoad(20)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Mes rapports Obj/EXECUTION/Exporter button'), 5)

def export1 = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Exporter button'), 'title', 'equals', 
    'Exporteer naar excel', true)

WebUI.click(export1)

/*WebUI.waitForElementClickable(findTestObject('Mes rapports Obj/EXECUTION/Exporter button'), 5)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Exporter button'))*/
WebUI.waitForPageLoad(60)

WebUI.waitForElementClickable(findTestObject('Page_eBlox Rapportering/Definition'), 15)

def definition1 = WebUI.modifyObjectProperty(findTestObject('Page_eBlox Rapportering/Definition'), 'xpath', 'contains', 
    '//li//div[@class=\'btn-group\']//a[contains(text(),\'Definitie\')]', true)

WebUI.click(definition1)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Proprietes'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Graphiques - propres graphiques checkbox'))

WebUI.uncheck(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Graphiques - suggestions SD checkbox'))

WebUI.uncheck(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Tableau croise checkbox'))

WebUI.verifyElementChecked(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Contenu checkbox'), 
    2)

WebUI.click(findTestObject('Page_eBlox Rapportering/Execution tab'))

WebUI.waitForPageLoad(10)

def export2 = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Exporter button'), 'title', 'equals', 
    'Exporteer naar excel', true)

WebUI.click(export2)

WebUI.waitForPageLoad(60)

WebUI.waitForElementClickable(findTestObject('Page_eBlox Rapportering/Definition'), 15)

//WebUI.waitForElementClickable(findTestObject('Page_eBlox Rapportering/Definition'), 5)
//WebUI.click(findTestObject('Page_eBlox Rapportering/Definition'))
def definition2 = WebUI.modifyObjectProperty(findTestObject('Page_eBlox Rapportering/Definition'), 'xpath', 'contains', 
    '//li//div[@class=\'btn-group\']//a[contains(text(),\'Definitie\')]', true)

WebUI.click(definition2)

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_eBlox Rapportering/Proprietes'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Graphiques - propres graphiques checkbox'))

WebUI.uncheck(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Graphiques - suggestions SD checkbox'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Tableau croise checkbox'))

WebUI.uncheck(findTestObject('Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/Contenu checkbox'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_eBlox Rapportering/Execution tab'))

WebUI.waitForPageLoad(10)

def export3 = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Exporter button'), 'title', 'equals', 
    'Exporteer naar excel', true)

WebUI.click(export3)

WebUI.waitForPageLoad(60)

WebUI.closeBrowser()

