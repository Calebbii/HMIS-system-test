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

WebUI.navigateToUrl('https://apps.gerties.org:9100/app/insurance-category')

WebUI.click(findTestObject('Page_Login/a_Login'))

WebUI.setText(findTestObject('Page_Login/input_Email_login_email'), 'devintern@gerties.org')

WebUI.setText(findTestObject('Page_Login/input_Password_login_password'), 'hmistest')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Insurance Category/button_Add Insurance Category'))

WebUI.click(findTestObject('Page_New Insurance Category/button_Add Row'))

WebUI.click(findTestObject('Page_New Insurance Category/div_Edit'))

WebUI.setText(findTestObject('Page_New Insurance Category/input_Insurance Billing Rule Templates_input-with-feedback form-control'), 
    'Covid Testing')

WebUI.click(findTestObject('Page_New Insurance Category/input_Valid From_input-with-feedback form-control'))

WebUI.setText(findTestObject('Page_New Insurance Category/input_Valid From_input-with-feedback form-control'), '04-06-2021')

WebUI.click(findTestObject('Page_New Insurance Category/input_Valid Upto_input-with-feedback form-control'))

WebUI.setText(findTestObject('Page_New Insurance Category/input_Valid Upto_input-with-feedback form-control'), '02-03-2022')

WebUI.click(findTestObject('Page_New Insurance Category/button_Insert Below'))

WebUI.click(findTestObject('Page_New Insurance Category/svg_Insert Below_icon  icon-sm'))

