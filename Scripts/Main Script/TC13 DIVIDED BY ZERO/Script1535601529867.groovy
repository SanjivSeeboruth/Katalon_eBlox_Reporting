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

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC Input text in search textfield'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC VErify Search icon'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sub Script/Navigation_Menu/Menu_Mes_rapports/Main_Content/TC Select report name'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Description _Date de reference historique'))

WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Description_Date de reference historique - Dernier jour mois precedent'))

WebUI.delay(5)

/*WebUI.waitForElementPresent(findTestObject('Mes rapports Obj/EXECUTION/Ref historic - dropdown'), 10)

WebUI.waitForElementClickable(findTestObject('Mes rapports Obj/EXECUTION/Ref historic - dropdown'), 10)

def historic = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Ref historic - dropdown'), 'xpath', 'contains', 
    '//*[@id="uitvoering-parameters"]/div/div[2]/div/div/table/tbody/tr[4]/td[2]/div/div/rapp-date-prompt/div/div/rapp-special-values/div/button', 
    true)

WebUI.click(historic)

WebUI.delay(2)*/
/*def historicType = new TestObject('Select_historic_Type')

historicType.addProperty('xpath', ConditionType.EQUALS, '//span[contains(text(),\'Laatste dag vorige maand\')]')

WebUI.click(historicType)*/
WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUiBuiltInKeywords.waitForPageLoad(15)

WebUI.callTestCase(findTestCase('Sub Script/Select Language/TC2 Verify FR Language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUiBuiltInKeywords.waitForPageLoad(10)

WebUI.waitForElementPresent(findTestObject('Mes rapports Obj/EXECUTION/Ref historic - dropdown'), 10)

WebUI.waitForElementPresent(findTestObject('Mes rapports Obj/EXECUTION/Ref historic - dropdown'), 10)

/*def historicFR = WebUI.modifyObjectProperty(findTestObject('Mes rapports Obj/EXECUTION/Ref historic - dropdown'), 'xpath', 'contains', 
    '//*[@id="uitvoering-parameters"]/div/div[2]/div/div/table/tbody/tr[4]/td[2]/div/div/rapp-date-prompt/div/div/rapp-special-values/div/button', 
    true)

WebUI.click(historicFR)*/
WebUI.delay(2)

WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Description _Date de reference historique'))

WebUI.delay(2)

def historicTypeFR = new TestObject('Select_historic_Type')

historicTypeFR.addProperty('xpath', ConditionType.EQUALS, '//span[contains(text(),\'Dernier jour mois précédent\')]')

WebUI.click(historicTypeFR)

WebUI.delay(5)

WebUiBuiltInKeywords.waitForPageLoad(10)

////*[@id="parameters"]/div/form/div[2]/div/div/div/ul/li[2]/button
WebUI.click(findTestObject('Mes rapports Obj/EXECUTION/Button executer'))

WebUI.closeBrowser()

