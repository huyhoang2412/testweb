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

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FLAGSIN/input_Login_password'), 'lt7kXPiIKwaT+RdC1Uoh9g==')

WebUI.sendKeys(findTestObject('Object Repository/Page_FLAGSIN/input_Login_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/a_Companies'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/span_Add COMPANY'))

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_name'), 'Vape')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_email'), 'vapoa@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_phone'), '0911111111')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_fax'), '25667777')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_ADDRESS_address_1'), 'Fox')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_ADDRESS_address_2'), 'Bass')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_TN_city'), 'Vapw')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_TN_zip_code'), '567890')

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/span_CREATE'))

WebUI.closeBrowser()

