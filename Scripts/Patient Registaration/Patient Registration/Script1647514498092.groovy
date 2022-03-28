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

WebUI.click(findTestObject('Page_Gertrudes Childrens Hospital/a_Login'))

WebUI.click(findTestObject('Page_Login/a_Forgot Password'))

WebUI.click(findTestObject('Page_Login/a_Back to Login'))

WebUI.setText(findTestObject('Page_Login/input_Email_login_email'), 'devintern@gerties.org')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_login_password'), '2Y+Fq/E3aIsYLI6t/JFI9w==')

WebUI.click(findTestObject('Page_Login/span_Show'))

WebUI.click(findTestObject('Page_Login/span_Hide'))

WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.click(findTestObject('Page_Set Station/svg_Enter Your Current Station_icon  icon-sm'))

WebUI.navigateToUrl('https://apps.gerties.org:9100/app/patient')

WebUI.click(findTestObject('Page_Patient/span_Add Patient'))

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_First Name_input-with-feedback form-control bold'), 
    'Mateo')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Middle Name_input-with-feedback form-control'), 'Van')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Last Name ( Surname )_input-with-feedback form-control bold'), 
    'Kovacic')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Gender_input-with-feedback form-control bold'), 'Male')

WebUI.selectOptionByLabel(findTestObject('Page_New Patient - new-patient-1/select_A PositiveA NegativeAB PositiveAB NegativeB PositiveB NegativeO PositiveO Negative'), 
    'A Positive', false)

WebUI.click(findTestObject('Page_New Patient - new-patient-1/input_Date of birth_input-with-feedback form-control bold'))

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Date of birth_input-with-feedback form-control bold'), 
    '02-06-2018')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Nationality_input-with-feedback form-control'), 'Croatian')

WebUI.check(findTestObject('Page_New Patient - new-patient-1/span_Is VIP Patient_input-area'))

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Staff No_input-with-feedback form-control bold'), 'GHCS0008')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Staff Email_input-with-feedback form-control bold'), 
    'devintern@gerties.org')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Staff Extension_input-with-feedback form-control bold'), 
    '8974')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Country Code_input-with-feedback form-control'), '254')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Phone_input-with-feedback form-control'), '710516225')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Physical File_input-with-feedback form-control'), 'GCHO01')

not_run: WebUI.click(findTestObject('Page_New Patient - new-patient-1/button_Add Row'))

not_run: WebUI.click(findTestObject('Page_New Patient - new-patient-1/div_Is Primary_col grid-static-col col-xs-3  error bold'))

not_run: WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Is Primary_input-with-feedback form-control bold input-sm'), 
    'GCHPAR00002')

not_run: WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Mustafa_input-with-feedback form-control bold input-sm'), 
    'Father')

not_run: WebUI.check(findTestObject('Page_New Patient - new-patient-1/input_Begin typing for results_input-with-feedback bold input-sm'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_New Patient - new-patient-1/div_Edit'))

not_run: WebUI.click(findTestObject('Page_New Patient - new-patient-1/svg_Editing Row_icon  icon-sm'))

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Country_input-with-feedback form-control bold'), 'Kenya')

not_run: WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_County_input-with-feedback form-control bold'), 
    'Nairobi')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Location_input-with-feedback form-control'), 'Kitengela')

not_run: WebUI.check(findTestObject('Page_New Patient - new-patient-1/input_undefined_input-with-feedback'))

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Religion_input-with-feedback form-control bold'), 'Buddahism')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Denomination_input-with-feedback form-control'), 'Mahayana Buddhism')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Race_input-with-feedback form-control'), 'Indian')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Primary Language_input-with-feedback form-control bold'), 
    'English')

WebUI.setText(findTestObject('Page_New Patient - new-patient-1/input_Secondary Language_input-with-feedback form-control'), 
    'Hindu')

WebUI.selectOptionByLabel(findTestObject('Page_New Patient - new-patient-1/select_YesNo'), 'No', false)

WebUI.selectOptionByLabel(findTestObject('Page_New Patient - new-patient-1/select_YesNo'), 'No', false)

WebUI.selectOptionByLabel(findTestObject('Page_New Patient - new-patient-1/select_YesNo'), 'No', false)

WebUI.selectOptionByLabel(findTestObject('Page_New Patient - new-patient-1/select_YesNo'), 'No', false)

WebUI.selectOptionByLabel(findTestObject('Page_New Patient - new-patient-1/select_YesNo'), 'No', false)

