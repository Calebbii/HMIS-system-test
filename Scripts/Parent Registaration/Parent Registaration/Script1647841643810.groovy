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

WebUI.navigateToUrl('https://apps.gerties.org:9100/')

WebUI.click(findTestObject('Page_Login/a_Login'))

WebUI.setText(findTestObject('Page_Login/input_Email_login_email'), 'devintern@gerties.org')

WebUI.setText(findTestObject('Page_Login/input_Password_login_password'), 'hmistest')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Set Station/svg_Enter Your Current Station_icon  icon-sm'))

WebUI.navigateToUrl('https://apps.gerties.org:9100/app/parent')

WebUI.click(findTestObject('Page_Parent/span_Add Parent'))

WebUI.setText(findTestObject('Page_Parent/input_First Name_input-with-feedback form-control bold'), 'Thomas')

WebUI.setText(findTestObject('Page_New Parent - new-parent-1/input_Middle Name (optional)_input-with-feedback form-control'), 
    'Van')

WebUI.setText(findTestObject('Page_Parent/input_Last Name_input-with-feedback form-control bold'), 'Tuchel')

WebUI.setText(findTestObject('Page_Parent/input_Country Code_input-with-feedback form-control'), '254')

WebUI.setText(findTestObject('Page_Parent/input_Phone Number_input-with-feedback form-control bold'), '710516225')

WebUI.setText(findTestObject('Page_Parent/input_Email_input-with-feedback form-control'), 'cal@gmail.com')

WebUI.setText(findTestObject('Page_Parent/input_Identification Type_input-with-feedback form-control bold'), 'National ID Card')

WebUI.setText(findTestObject('Page_Parent/input_Identification Number_input-with-feedback form-control bold'), '2636834')

WebUI.setText(findTestObject('Page_Parent/input_Occupation_input-with-feedback form-control'), 'Cleaner')

WebUI.setText(findTestObject('Page_Parent/input_Marital Status_input-with-feedback form-control'), 'Divorced')

WebUI.setText(findTestObject('Page_Parent/input_Primary Language_input-with-feedback form-control bold'), 'Dutch')

WebUI.setText(findTestObject('Page_Parent/input_Secondary Language_input-with-feedback form-control'), 'English')

WebUI.click(findTestObject('Page_Parent/button_Edit in full page'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_New Parent - new-parent-1/input_Employer_input-with-feedback form-control'), 'Samsang')

WebUI.setText(findTestObject('Page_Parent/input_Country_input-with-feedback form-control'), 'Kenya')

WebUI.click(findTestObject('Page_New Parent - new-parent-1/button_Add Row'))

WebUI.click(findTestObject('Page_New Patient - new-patient-1/div_Edit'))

WebUI.setText(findTestObject('Page_New Parent - new-parent-1/input_Employer_input-with-feedback form-control bold'), 'GCHCCO00001')

WebUI.setText(findTestObject('Page_New Parent - new-parent-1/input_Position_input-with-feedback form-control'), '')

