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

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/a_Photos'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/a_ADD PHOTO'))

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/input_UPLOAD PHOTO_name'), 'Ramlaptop')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/textarea_UPLOAD PHOTO_description'), 'R')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/textarea_R'), 'Ra')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/textarea_Ra'), 'Ram')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/textarea_Ram'), 'Ram ')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/textarea_Ram_1'), 'Ram 4')

WebUI.setText(findTestObject('Object Repository/Page_FLAGSIN/textarea_Ram 4'), 'Ram 4g')

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_Pats Territory'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_131'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_TEST'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_Right Elevation'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/span_Metrics'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/div_Blistering'))

WebUI.click(findTestObject('Object Repository/Page_FLAGSIN/span_CREATE'))

WebUI.closeBrowser()

