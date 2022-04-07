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

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_login_password'), '2Y+Fq/E3aIsYLI6t/JFI9w==')

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Set Station/svg_Enter Your Current Station_icon  icon-sm'))

WebUI.navigateToUrl('https://apps.gerties.org:9100/app/patient-encounter')

WebUI.click(findTestObject('Page_Patient Encounter/span_Add Patient Encounter'))

WebUI.setText(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Patient_input-with-feedback form-control bold'), 
    'Caleb Kiprotich Bii')

WebUI.setText(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Phone Number_input-with-feedback form-control'), 
    '710516225')

not_run: WebUI.uncheck(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_undefined_input-with-feedback'))

WebUI.check(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_undefined_input-with-feedback'))

WebUI.setText(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Sales Invoice_input-with-feedback form-control'), 
    'ACC-SINV-2022-00010')

WebUI.selectOptionByLabel(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/select_CashInsurance'), 'Insurance', 
    false)

WebUI.setText(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Primary Doctor_input-with-feedback form-control bold'), 
    'HLC-PRAC-2021-00003')

WebUI.setText(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Clinic_input-with-feedback form-control'), 
    'Outpatient Clinic - GCH')

WebUI.setText(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Branch_input-with-feedback form-control'), 
    'TRM')

WebUI.click(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Encounter Date_input-with-feedback form-control bold'))

WebUI.setText(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Encounter Date_input-with-feedback form-control bold'), 
    '28-03-2022')

WebUI.click(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Encounter Start Time_input-with-feedback form-control bold'))

WebUI.setText(findTestObject('Page_New Patient Encounter - new-patient-encounter-1/input_Encounter Start Time_input-with-feedback form-control bold'), 
    '08:00:00')

