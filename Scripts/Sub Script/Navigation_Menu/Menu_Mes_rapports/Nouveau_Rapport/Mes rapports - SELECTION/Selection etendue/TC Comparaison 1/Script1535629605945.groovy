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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

TestData excelData = findTestData('Data Files/Data/TestData')

//int rowNo = Integer.parseInt(GlobalVariable.currentTestCaseId)

WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Dropdown criteria for condition'))

if (excelData.getValue( 61, 8) != '')
{
	
	def option = new TestObject('option')
	
	option.addProperty('xpath', ConditionType.EQUALS, "//*[@id=\"rapp-disable-toevoegen-knoppen-tabel\"]/table/tbody/tr/td/div[2]/div/div/div/ul/li/div/div/div/ui-view/div/form/div/div[1]/div/div[1]/rapp-button-dropdown/div/ul/li/a[contains(text(),\'"+excelData.getValue( 61, 8)+"\')]")
																																									
	WebUI.click(option)

	WebUI.delay(1)
  
}