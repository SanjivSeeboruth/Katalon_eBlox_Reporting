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

def no_Of_Columns = excelData.getColumnNumbers()

println (no_Of_Columns)

def no_Of_Rows = excelData.getRowNumbers()

println (no_Of_Rows)

for(int i=4;i<=13;i++){
	println (excelData.getValue(i, 2))
}

/*for (int i = 1; i <= no_Of_Columns; i++){
	for (int j = 1; j <= no_Of_Rows; j++){
		println(excelData.getValue(i, j))
	}
}*/

/*List<String> ints = new ArrayList<>();

for (int i = 1; i <= no_Of_Columns; i++){

	ints.add(excelData.getValue(i, 1))

	//println(excelData.getValue(i, 1))
}

if (ints.get(10).equals("1")) {
	println ("Good")
}*/

/*
for (int i = 1; i <= no_Of_Columns; i++) {
	WebUI.setText(findTestObject('Mes rapports Obj/CONTENU/input_Contenu_Selecteur'), excelData.getValue('Name', i))

	WebUI.delay(3)
	
	def selecteur = new TestObject('Choisir_selecteur')
	
	selecteur.addProperty('xpath', ConditionType.EQUALS, "//span[contains(text(),\'"+ excelData.getValue('Object Name', i) +"\')]")
	
	WebUI.click(selecteur)
	
	WebUI.delay(3)

	WebUI.click(findTestObject('Mes rapports Obj/CONTENU/click_Remove_text'))
}*/