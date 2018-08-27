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

TestData excelData = findTestData('Data/TC NEW')

def no_Of_Rows = excelData.getRowNumbers()

for (int i = 1; i <= no_Of_Rows; i++) {
	
	if(excelData.getValue('Travailleur Name', i)!=""){
	
	def Select_travailleur = new TestObject('Select_travailleur_by_name')

	Select_travailleur.addProperty('xpath', ConditionType.EQUALS, "//div[@id=\'select2-drop\']//ul[@class=\'select2-results\']//li[@role=\'presentation\']//div[contains(text(),\'"+excelData.getValue('Travailleur Name', i) +"\')]")
	
	WebUI.click(Select_travailleur)

	WebUI.delay(1)
	
	}
	
	else{
		break
	}
}

WebUI.waitForPageLoad(15)

WebUI.click(findTestObject('Mes rapports Obj/SELECTION/Travailleur/Page_eBlox Reporting/Close_dropdown'))

WebUI.delay(2)