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

WebUI.setText(findTestObject('Page_New Insurance Category/input_Category Name_input-with-feedback form-control bold'), 'Fintech')

WebUI.setText(findTestObject('Page_New Insurance Category/input_Employer_input-with-feedback form-control'), 'Sanlam')

WebUI.setText(findTestObject('Page_New Insurance Category/input_Kranium ID_input-with-feedback form-control'), '121232')

WebUI.click(findTestObject('Page_New Insurance Category/input_Valid From_input-with-feedback form-control'))

WebUI.setText(findTestObject('Page_New Insurance Category/input_Valid From_input-with-feedback form-control'), '04-02-2022')

WebUI.click(findTestObject('Page_New Insurance Category/input_Valid Upto_input-with-feedback form-control'))

WebUI.setText(findTestObject('Page_New Insurance Category/input_Valid Upto_input-with-feedback form-control'), '04-11-2022')

WebUI.check(findTestObject('Page_New Insurance Category/input_Valid Upto_input-with-feedback'))

WebUI.uncheck(findTestObject('Page_New Insurance Category/input_Valid Upto_input-with-feedback'))

not_run: WebUI.setText(findTestObject(null), 'Insuranace Details')

WebUI.setText(findTestObject('Page_New Insurance Category/input_Inpatient Cover_input-with-feedback form-control'), 'Sanlam')

WebUI.setText(findTestObject('Page_New Insurance Category/input_Outpatient Cover_input-with-feedback form-control'), 'Britam')

WebUI.setText(findTestObject('Page_New Insurance Category/input_Inpatient Cover Limit_input-with-feedback form-control bold'), 
    '5,000,000.00')

WebUI.setText(findTestObject('Page_New Insurance Category/input_Outpatient Cover Limit_input-with-feedback form-control bold'), 
    '500,000.00')

not_run: WebUI.setText(findTestObject(null), 'Copayment Details')

WebUI.click(findTestObject('Page_New Insurance Category/button_Add Row'))

WebUI.click(findTestObject('Page_New Insurance Category/div_Edit'))

not_run: WebUI.setText(findTestObject('Page_New Insurance Category/input_Healthcare Service Unit_input-with-feedback form-control'), 
    '')

