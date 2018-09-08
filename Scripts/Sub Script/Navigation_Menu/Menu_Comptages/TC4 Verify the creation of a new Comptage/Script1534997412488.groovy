import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.junit.After
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

TestData excelData = findTestData('Data Files/Data/TestData')

//int rowNo = Integer.parseInt(GlobalVariable.currentTestCaseId)
//input[@name='oms2NL']
WebDriver driver = DriverFactory.getWebDriver()

String checkName = driver.findElement(By.xpath("//*[@id=\"navbar-anchor\"]/div[2]/div[1]/div/div")).getText()

println (checkName)

if (checkName=="Welkom ( SD admin )") 
{
	def Input_Name_NL = new TestObject('input_name_nl')
	
	Input_Name_NL.addProperty('xpath', ConditionType.EQUALS, "//input[@name='oms2NL']")
	
	WebUI.setText(Input_Name_NL, excelData.getValue(70,2))
	
	WebUI.delay(2)
}

else
{
	def Input_Name_FR = new TestObject('input_name_fr')
	
	Input_Name_FR.addProperty('xpath', ConditionType.EQUALS, "//input[@name='oms2FR']")
	
	WebUI.setText(Input_Name_FR, excelData.getValue(71,2))
	
	WebUI.delay(2)
}

WebUI.click(findTestObject('Comptages Obj/dropdown_arrow'))

WebUI.delay(5)



if (checkName=="Welkom ( SD admin )") 
{
	if (excelData.getValue(72,2)!="")
	{
		def comptage = new TestObject('comptage_type')
	
		comptage.addProperty('xpath', ConditionType.EQUALS, "//ul//li//div[contains (text(),\'"+excelData.getValue(72,2)+"\')]")
	
		WebUI.click(comptage)
	
	}
}

else
{
	def comptageFR = new TestObject('comptage_type')
	
	comptageFR.addProperty('xpath', ConditionType.EQUALS, "//ul//li//div[contains (text(),\'"+excelData.getValue(73,2)+"\')]")
	
	WebUI.click(comptageFR)
}