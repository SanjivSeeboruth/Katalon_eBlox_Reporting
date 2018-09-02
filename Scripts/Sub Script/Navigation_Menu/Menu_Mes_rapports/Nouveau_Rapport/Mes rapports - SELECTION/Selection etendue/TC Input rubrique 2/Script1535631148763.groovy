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

TestData excelData = findTestData('Data Files/Data/TestData')

//int rowNo = Integer.parseInt(GlobalVariable.currentTestCaseId)

if (excelData.getValue(63, 8) != "")
{
	
	def inputRub = WebUI.modifyObjectProperty(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), 'xpath', 'equals', '//*[@id="s2id_autogen8_search"]', false)
	
	//WebUI.waitForElementClickable(inputRub, 10)
	
	//WebUI.click(inputRub)
	
	WebUI.setText(inputRub, excelData.getValue(63, 8))
	
	WebUI.delay(1)
	
	//def inputRub1 = WebUI.modifyObjectProperty(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), 'xpath', 'equals', '//*[@id="s2id_autogen8_search"]', false)
	
	WebUI.sendKeys(findTestObject('Page_eBlox Rapportering/Operation/Input condition for plus icon'), Keys.chord(Keys.ENTER))
  
}

WebUI.delay(1)