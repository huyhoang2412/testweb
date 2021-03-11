import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://flagsin-dev.webdigital.vn/login')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_Login_username'), 'adminpix')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_Login_password'), 'admin@123')

WebUI.sendKeys(findTestObject('Object Repository/Page_FLAGSIN/input_Login_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/a_Jobs'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/span_ADD JOB'))

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_ADD JOB_code'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_ADD JOB_name'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_ADD JOB_company_sid'), 'w')

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_Walmart'))

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/span_Territory'), '')

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_ALL'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/span_NEW'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_INACTIVE'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/input_INACTIVE_push_notification'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/button_START'))

WebUI.closeBrowser()

