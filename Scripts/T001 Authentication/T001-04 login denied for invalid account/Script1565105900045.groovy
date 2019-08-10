import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.start_url)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_User Name_j_username'), 'no_valid_user')

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Password_j_password'), 'no_valid_password')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Password_submit'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/div_Your User Name and Password combination could not be found Please try again If you continue to have trouble please click Forgot Password or contact the Administrator'))

WebUI.closeBrowser()

