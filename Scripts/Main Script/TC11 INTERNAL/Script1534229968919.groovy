import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.google.common.collect.FilteredEntryMultimap.Keys as Keys
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

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.click(findTestObject('Mes rapports Obj/New button dropdown'))

WebUI.click(findTestObject('Mes rapports Obj/intern option'))

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Mes rapports - BASE DE RAPPORT/TC1  Verify radio button creer un tout nouveau rapport'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Mes rapports - CONTENU/TC Verify input field INTERNAL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 10 Deselect all checkbox'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.waitForElementClickable(findTestObject('Mes rapports Obj/EXECUTION/Button executer'), 5)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Mes rapports Obj/PROPRIETES/Generalites - input name'), 10)

WebUI.waitForElementClickable(findTestObject('Mes rapports Obj/PROPRIETES/Name - Language dropdown'), 5)

WebUI.click(findTestObject('Mes rapports Obj/PROPRIETES/Name - Language dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Mes rapports Obj/PROPRIETES/Name - Francais'))

WebUI.focus(findTestObject('Mes rapports Obj/PROPRIETES/Generalites - input name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Mes rapports Obj/PROPRIETES/Generalites - input name'), 'TEST REG IPS 12.08.2018')

def map = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/PROPRIETES/Generalities - Dossier dropdown'), 'xpath', 
    'contains', '//*[@id="s2id_autogen17"]/a', true)

WebUI.click(map)

WebUI.delay(1)

def mapName = new TestObject('Select_map_name')

mapName.addProperty('xpath', ConditionType.EQUALS, '//div[contains(text(),\'TEST REG IPS DATUM\')]')

WebUI.click(mapName)

//div[contains(text(),'TEST REG IPS DATUM')]
//button[contains(text(),'Opslaan')]
//not_run: WebUI.click(findTestObject('Page_eBlox Reporting/button_Sauvegarder'))
def sauvegarder_Button = WebUI.modifyObjectProperty(findTestObject('Page_eBlox Reporting/button_Sauvegarder'), 'xpath', 
    'equals', '//button[contains(text(),\'Opslaan\')]', true)

WebUI.click(sauvegarder_Button)

WebUiBuiltInKeywords.waitForPageLoad(10)

not_run: WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Annuler nouveau rapport'))

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.waitForElementClickable(findTestObject('Admin Obj/Admin_tab'), 10)

WebUI.click(findTestObject('Admin Obj/Admin_tab'))

WebUiBuiltInKeywords.click(findTestObject('Admin Obj/Concerns'))

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.delay(2)

def selectConcern = new TestObject('Select_concern_number')

selectConcern.addProperty('xpath', ConditionType.EQUALS, '//a[@ui-sref=\'admin.concernInfo.detail({id:concern.concernNr})\']//span[contains(text(),\'00040\')]')

WebUI.click(selectConcern)

WebUI.delay(2)

def userConcern = new TestObject('User_concern_number')

userConcern.addProperty('xpath', ConditionType.EQUALS, '//li[@ng-repeat=\'user in concernDetailVm.concern.users\']//a[contains(text(),\'00040_02\')]')

WebUI.click(userConcern)

WebUiBuiltInKeywords.waitForPageLoad(10)

not_run: WebUI.click(findTestObject('Page_eBlox Reporting/button_Vers Mes rapports'))

not_run: WebUI.click(findTestObject('Page_eBlox Reporting/select_FolderName'))

WebUI.closeBrowser()

