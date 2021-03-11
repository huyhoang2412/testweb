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

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/button_Add User'))

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_first_name'), 'Nguyen')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_last_name'), 'Hoang')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_Login_username'), 'huyhoang')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_password'), 'tRJ+R27vQWPHkRdkdS4IJw==')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_email'), 'hoanghuynguyen@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_phone_number'), '0945576647')

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_title'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_date_birth'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/button_2021'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/button_CREATE_ant-picker-header-super-prev-btn'))

WebUI.click(findTestObject('Page_FLAGSIN/button_CREATE_ant-picker-header-super-prev-btn'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/button_CREATE_ant-picker-header-super-prev-btn'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_1999'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_Dec'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/td_24'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_INFORMATION_ant-col ant-col-12'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/input_INFORMATION_title'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/input_ADDRESS_address_1'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/span_CREATE'))

WebUI.closeBrowser()

