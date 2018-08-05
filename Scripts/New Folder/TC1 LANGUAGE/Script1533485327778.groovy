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

'Login eBlox Reporting'
WebUI.callTestCase(findTestCase('Login/TC1 Login to Mysdworx'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

'Language is set to NL'
WebUI.callTestCase(findTestCase('Select Language/TC1 Verify NL language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

'Open \'Mijn Rapporten\''
WebUI.callTestCase(findTestCase('Menu-Mes rapports (NL)/TC Verify Mes rapports tab'), [:], FailureHandling.STOP_ON_FAILURE)

'Click \'Alles openklappen\''
WebUI.callTestCase(findTestCase('Menu-Mes rapports (NL)/TC1 Verify Deployer function'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

'Click \'Alles toeklappen\''
WebUI.callTestCase(findTestCase('Menu-Mes rapports (NL)/TC2 Verify Masquer function'), [:], FailureHandling.STOP_ON_FAILURE)

'Click the info icon'
WebUI.callTestCase(findTestCase('Menu-Mes rapports (NL)/TC3 Verify info icon function'), [:], FailureHandling.STOP_ON_FAILURE)

'Check that the user name and the concern number are not shown in the URL '
WebUI.callTestCase(findTestCase('Menu-Mes rapports (NL)/TC4 Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

'Switch language to FR'
WebUI.callTestCase(findTestCase('Select Language/TC2 Verify FR Language'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

'Open \'Mes rapports\''
WebUI.callTestCase(findTestCase('Menu-Mes rapports (FR)/TC Verify Mes rapports tab'), [:], FailureHandling.STOP_ON_FAILURE)

'Click \'\'Déployer tout\''
WebUI.callTestCase(findTestCase('Menu-Mes rapports (FR)/TC1 Verify Deployer function'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(5)

'Click \'Masquer tout\' '
WebUI.callTestCase(findTestCase('Menu-Mes rapports (FR)/TC2 Verify Masquer function'), [:], FailureHandling.STOP_ON_FAILURE)

'Click the info icon'
WebUI.callTestCase(findTestCase('Menu-Mes rapports (FR)/TC3 Verify info icon function'), [:], FailureHandling.STOP_ON_FAILURE)

'Check that the user name and the concern number are not shown in the URL '
WebUI.callTestCase(findTestCase('Menu-Mes rapports (FR)/TC4 Verify Url'), [:], FailureHandling.STOP_ON_FAILURE)

