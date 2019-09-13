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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://tds-edc.com/lcw020/pages/login/login')

WebUI.setText(findTestObject('Page_OpenClinica/input_User Name_j_username'), 'inv_02')

WebUI.setEncryptedText(findTestObject('Page_OpenClinica/input_Password_j_password'), '8vIdntyLY2Lngp+z13nsvA==')

WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.setText(findTestObject('Page_OpenClinica/input_Support_findSubjects_f_studySubjectlabel'), 'T014_Q_201909132049')

WebUI.sendKeys(findTestObject('Page_OpenClinica/input_Support_findSubjects_f_studySubjectlabel'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_OpenClinica/img_v1_bt_EnterData1'))

WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Page_submittedResume'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Page_markComplete'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Page_markComplete'))

WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/input_inv_02_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica/img_v1_bt_EnterData1_1'))

WebUI.setText(findTestObject('Page_OpenClinica Double Data Entry/input_Item response_type text and data_type INT_input119'), 
    '-1')

WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Return to top_submittedResume'))

WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Return to top_submittedResume'))

WebUI.setText(findTestObject('Page_OpenClinica Double Data Entry/input_INT_IG_T014D_REPGROUP_0input118'), '-2')

WebUI.setText(findTestObject('Page_OpenClinica Double Data Entry/input_INT_IG_T014D_REPGROUP_manual1input118'), '-3')

WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Return to top_markComplete'))

WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume_1'))

WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume_2'))

WebUI.closeBrowser()

