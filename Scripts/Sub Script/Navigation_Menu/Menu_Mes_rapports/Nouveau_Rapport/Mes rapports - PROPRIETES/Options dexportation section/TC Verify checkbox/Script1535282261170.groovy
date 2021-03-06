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

TestData excelData = findTestData('Data/TC2 NEW')

def no_Of_Rows = excelData.getRowNumbers()

String value;

for (int i = 1; i <= no_Of_Rows; i++) {
	if (excelData.getValue('Options Exportation', i)!="") {
		Boolean verifyChecbox = WebUI.waitForElementClickable(findTestObject("Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/'"+ excelData.getValue('Options Exportation', i) +"checkbox'"),
			2)
		if (verifyChecbox==true) {
			value = "check"
		}
		else{
			value = "uncheck"
		}
		
		if (value == excelData.getValue('First Option', i) ) {
			
			WebUI.(excelData.getValue('First Option', i))(findTestObject("Page_eBlox Rapportering/Definition - Proprietes - Options d exportation/'"+ excelData.getValue('Options Exportation', i) +"checkbox'"))
		}
	}
	
	else{
		break
	}
	
	
	
}


