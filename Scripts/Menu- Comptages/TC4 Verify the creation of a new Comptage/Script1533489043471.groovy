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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.setText(findTestObject('Comptages Obj/input_comptage_name'), 'testing')

WebUiBuiltInKeywords.click(findTestObject('Comptages Obj/dropdown_arrow'))

WebUI.delay(5)

WebUI.setText(findTestObject('Comptages Obj/input_comptage_type'), 'Attest loonlasten ')

WebUI.sendKeys(findTestObject('Comptages Obj/input_comptage_type'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Comptages Obj/button_Sauvegarder'))

WebUI.acceptAlert()

