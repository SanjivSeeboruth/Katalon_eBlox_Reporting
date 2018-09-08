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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Keys as Keys
import org.junit.After
import org.openqa.selenium.By

//WebUI.click(findTestObject('Page_eBlox Rapportering/Operation/Operation - Sauvegarder button'))

WebDriver driver = DriverFactory.getWebDriver()

String checkName = driver.findElement(By.xpath("//*[@id=\"navbar-anchor\"]/div[2]/div[1]/div/div")).getText()

if (checkName=="Welkom ( SD admin )")
{
	def save_btn_nl = new TestObject('sauvegarder_nl')
	
	save_btn_nl.addProperty('xpath', ConditionType.EQUALS, "//button[contains (text(),'Opslaan')]")
	
	WebUI.click(save_btn_nl)
}

else
{
	def save_btn_fr = new TestObject('sauvegarder_fr')
	
	save_btn_fr.addProperty('xpath', ConditionType.EQUALS, "//button[contains (text(),\' Sauvegarder\')]")
	
	WebUI.click(save_btn_fr)
}

WebUI.waitForPageLoad(10)