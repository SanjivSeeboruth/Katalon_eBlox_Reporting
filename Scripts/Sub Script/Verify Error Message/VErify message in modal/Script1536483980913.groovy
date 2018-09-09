import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.delay(1)

WebUI.focus(findTestObject('Mes rapports Obj/EXECUTION/Annuler Modal'))

WebDriver driver = DriverFactory.getWebDriver()

String msg = driver.findElement(By.xpath("//div[@class='modal-body row ng-scope']//div[contains(@class,'col-sm-10 col-sm-offset-1')]")).getText()

println (msg)

if (msg=="Als u dit nieuwe rapport verlaat, verliest u de reeds ingevulde gegevens.\nWat wilt u doen?") 
{
	
	KeywordUtil.markPassed("Message is present")
}
else
{
	KeywordUtil.markFailed("Message is not present")
}

WebUI.waitForPageLoad(10)