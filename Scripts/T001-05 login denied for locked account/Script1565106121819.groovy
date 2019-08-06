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

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_User Name_j_username'), GlobalVariable.tech_admin)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Password_j_password'), GlobalVariable.tech_admin_password)

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Password_submit'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Users'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Lockout Configuration'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_ of Failed Attempts_lockcount'), '3')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_ of Failed Attempts_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/div_The changes you made to the Lockout Configuration have been saved'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.start_url)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_User Name_j_username'), GlobalVariable.lock_account)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenClinica/input_Password_j_password'), 'th01Xh6r9ew=')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Password_submit'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_User Name_j_username'), GlobalVariable.lock_account)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenClinica/input_Password_j_password'), 'th01Xh6r9ew=')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Password_submit'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_User Name_j_username'), GlobalVariable.lock_account)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenClinica/input_Password_j_password'), 'th01Xh6r9ew=')

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Password_submit'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/div_Your User Name and Password combination has been Locked Please contact your OpenClinica Administrator to have them unlock your account'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.start_url)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_User Name_j_username'), GlobalVariable.tech_admin)

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Password_j_password'), GlobalVariable.tech_admin_password)

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Password_submit'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Tasks'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Users'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), GlobalVariable.lock_account)

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_Page 1 of 1_button_search'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/img_locked_bt_Unlock1'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/a_Log Out'))

WebUI.closeBrowser()

