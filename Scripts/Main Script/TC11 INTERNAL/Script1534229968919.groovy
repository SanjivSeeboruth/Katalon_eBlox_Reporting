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

CustomKeywords.'verify_Test_Case_Number.getTestCaseNumber.getTCNo'()

WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/TC Click on Nouveau rapport drpodown button'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/TC Select interne option'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - BASE DE RAPPORT/TC Verify radio button creer un tout nouveau rapport'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - CONTENU/TC Verify input field - Contenu'), 
    [('WaitPageToLoad') : GlobalVariable.TimeToWait], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - SELECTION/Verify if checkbox is unchecked/TC 10 Deselect all checkbox'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Executer button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify the next button arrow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Mes rapports Obj/PROPRIETES/Generalites - input name'), 10)

WebUI.waitForElementClickable(findTestObject('Mes rapports Obj/PROPRIETES/Name - Language dropdown'), 5)

WebUI.click(findTestObject('Mes rapports Obj/PROPRIETES/Name - Language dropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Mes rapports Obj/PROPRIETES/Name - Francais'))

WebUI.focus(findTestObject('Mes rapports Obj/PROPRIETES/Generalites - input name'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - PROPRIETES/Generalites section/TC Input name'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - PROPRIETES/Generalites section/TC Click on dossier dropdown'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Nouveau_Rapport/Mes rapports - PROPRIETES/Generalites section/TC input dossier to be save'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/TC Verify Sauvegarder button'), [:], FailureHandling.STOP_ON_FAILURE)

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

not_run: WebUI.closeBrowser()

