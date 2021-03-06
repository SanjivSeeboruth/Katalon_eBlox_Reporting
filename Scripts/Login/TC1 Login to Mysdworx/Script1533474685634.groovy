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
import javax.swing.JFrame as JFrame
import javax.swing.JOptionPane as JOptionPane

WebUI.openBrowser('')

WebUI.navigateToUrl('https://internet.acc.sd.dika.be/ebloxreporting/web.sensitive/main/?lang=fr')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_mysdworx - Log in/input_Username'), 'DP_EBLOX_RPP_VASCO')

JFrame frame = new JFrame('User Input Frame')

frame.requestFocus()

String pass = JOptionPane.showInputDialog(frame, 'Enter the password from token!!')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_mysdworx - Log in/input_Password'), pass)

WebUI.click(findTestObject('Page_mysdworx - Log in/button_Se connecter'))

WebUI.waitForPageLoad(GlobalVariable.TimeToWait)

not_run: WebUI.closeBrowser()

