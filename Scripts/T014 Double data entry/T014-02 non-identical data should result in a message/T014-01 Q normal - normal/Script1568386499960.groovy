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

def Today1String
use(groovy.time.TimeCategory, {
	def Today1 = new Date()
	Today1String =  Today1.format('yyyyMMddHHmm')
})

def Subject_Q = 'T014_Q_' + Today1String
def Subject_Q_Ev_A = 'T014_Q_A_' + Today1String
def Subject_Q_Ev_B1 = 'T014_Q_B1_' + Today1String
def Subject_Q_Ev_B2 = 'T014_Q_B2_' + Today1String

// define here the event-id's, as used in the study
def EV_A_ID='10'
def EV_B_ID='11'
def EV_C_ID='12'
def EV_D_ID='13'

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.start_url)
WebUI.setText(findTestObject('Page_OpenClinica/input_User Name_j_username'), GlobalVariable.account01)
WebUI.setText(findTestObject('Page_OpenClinica/input_Password_j_password'), GlobalVariable.password01)
WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

WebUI.click(findTestObject('Page_OpenClinica/a_Tasks'))
WebUI.click(findTestObject('Page_OpenClinica/a_Add Subject'))
WebUI.setText(findTestObject('Page_OpenClinica/input_Study Subject ID_label'), Subject_Q)
WebUI.selectOptionByValue(findTestObject('Page_OpenClinica/select_-Select-                                                    Male                        Female'), 
    'f', true)
WebUI.click(findTestObject('Page_OpenClinica/input__submitDone'))

// subject Q event A
WebUI.setText(findTestObject('Page_OpenClinica/input_Support_findSubjects_f_studySubjectlabel'), Subject_Q)
WebUI.click(findTestObject('Page_OpenClinica/input_Support_navSearchButton'))

WebUI.click(findTestObject('Page_OpenClinica/a_Schedule New Event'))

WebUI.selectOptionByValue(findTestObject('Page_OpenClinica/select_-Select-EV_A (Non-repeating)EV_B (Repeating)EV_C (Non-repeating)EV_D (Repeating)'), 
    EV_A_ID, true)
WebUI.setText(findTestObject('Page_OpenClinica/input_Location_location'), Subject_Q_Ev_A)
WebUI.click(findTestObject('Page_OpenClinica/input_Leave this field blank if the end datetime is not applicable_Submit'))
WebUI.click(findTestObject('Page_OpenClinica/img_v1_bt_EnterData0'))

WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_Item response_type text and data_type INT_input119'), '1')
WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Return to top_submittedResume'))
WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_INT_IG_T014D_REPGROUP_0input118'), '2')
WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_INT_IG_T014D_REPGROUP_manual1input118'), '3')

WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Page_markComplete'))
WebUI.acceptAlert()
WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Mark CRF Complete_submittedResume'))

// subject Q event B1
WebUI.setText(findTestObject('Page_OpenClinica/input_Support_findSubjects_f_studySubjectlabel'), Subject_Q)
WebUI.click(findTestObject('Page_OpenClinica/input_Support_navSearchButton'))

WebUI.click(findTestObject('Page_OpenClinica/a_Schedule New Event'))
WebUI.selectOptionByValue(findTestObject('Page_OpenClinica/select_-Select-EV_A (Non-repeating)EV_B (Repeating)EV_C (Non-repeating)EV_D (Repeating)'), 
    EV_B_ID, true)
WebUI.setText(findTestObject('Page_OpenClinica/input_Location_location'), Subject_Q_Ev_B1)
WebUI.click(findTestObject('Page_OpenClinica/input_Leave this field blank if the end datetime is not applicable_Submit'))
WebUI.click(findTestObject('Page_OpenClinica/img_v1_bt_EnterData0'))

WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_Item response_type text and data_type INT_input119'),'4')
WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Return to top_submittedResume'))
WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_INT_IG_T014D_REPGROUP_0input118'), '5')
WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_INT_IG_T014D_REPGROUP_manual1input118'), '6')

WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Page_markComplete'))
WebUI.acceptAlert()
WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Mark CRF Complete_submittedResume'))

// subject Q event B2
WebUI.setText(findTestObject('Page_OpenClinica/input_Support_findSubjects_f_studySubjectlabel'), Subject_Q)
WebUI.click(findTestObject('Page_OpenClinica/input_Support_navSearchButton'))

WebUI.click(findTestObject('Page_OpenClinica/a_Schedule New Event'))
WebUI.selectOptionByValue(findTestObject('Page_OpenClinica/select_-Select-EV_A (Non-repeating)EV_B (Repeating)EV_C (Non-repeating)EV_D (Repeating)'), 
    EV_B_ID, true)
WebUI.setText(findTestObject('Page_OpenClinica/input_Location_location'), Subject_Q_Ev_B2)
WebUI.click(findTestObject('Page_OpenClinica/input_Leave this field blank if the end datetime is not applicable_Submit'))
WebUI.click(findTestObject('Page_OpenClinica/img_v1_bt_EnterData0'))

WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_Item response_type text and data_type INT_input119'),'7')
WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Return to top_submittedResume'))
WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_INT_IG_T014D_REPGROUP_0input118'), '8')
WebUI.setText(findTestObject('Page_OpenClinica Initial Data Entry/input_INT_IG_T014D_REPGROUP_manual1input118'), '9')

WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Page_markComplete'))
WebUI.acceptAlert()
WebUI.click(findTestObject('Page_OpenClinica Initial Data Entry/input_Mark CRF Complete_submittedResume'))

WebUI.click(findTestObject('Page_OpenClinica/a_Log Out'))

// Data Entry 2
// ------------

WebUI.setText(findTestObject('Page_OpenClinica/input_User Name_j_username'), GlobalVariable.account02)
WebUI.setText(findTestObject('Page_OpenClinica/input_Password_j_password'), GlobalVariable.password02)
WebUI.click(findTestObject('Page_OpenClinica/input_Password_submit'))

// DE2 event A
WebUI.setText(findTestObject('Page_OpenClinica/input_Support_findSubjects_f_studySubjectlabel'), Subject_Q)
WebUI.click(findTestObject('Page_OpenClinica/input_Support_navSearchButton'))
WebUI.setText(findTestObject('Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), Subject_Q_Ev_A)
WebUI.click(findTestObject('Page_OpenClinica/input_Page 1 of 1_button_search'))
WebUI.click(findTestObject('Object Repository/Page_OpenClinica/img_v1_bt_EnterData1'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Item response_type text and data_type INT_input119'), '-1')
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Return to top_submittedResume'))
WebUI.verifyTextPresent("The value you specify does not match the value", false)
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Return to top_submittedResume'))
WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_INT_IG_T014D_REPGROUP_0input118'),	'-2')
WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_INT_IG_T014D_REPGROUP_manual1input118'), '-3')
WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Return to top_markComplete'))
WebUI.acceptAlert()
WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume'))
WebUI.verifyTextPresent("The value you specify does not match the value", false)
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume_1'))
WebUI.verifyTextPresent("Your data has been saved and the CRF was marked complete", false)

// DE2 event B1
WebUI.setText(findTestObject('Page_OpenClinica/input_Support_findSubjects_f_studySubjectlabel'), Subject_Q)
WebUI.click(findTestObject('Page_OpenClinica/input_Support_navSearchButton'))
WebUI.setText(findTestObject('Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), Subject_Q_Ev_B1)
WebUI.click(findTestObject('Page_OpenClinica/input_Page 1 of 1_button_search'))
WebUI.click(findTestObject('Page_OpenClinica/img_v1_bt_EnterData1'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Item response_type text and data_type INT_input119'), '-4')
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Return to top_submittedResume'))
WebUI.verifyTextPresent("The value you specify does not match the value", false)
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Return to top_submittedResume'))
WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_INT_IG_T014D_REPGROUP_0input118'),	'-5')
WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_INT_IG_T014D_REPGROUP_manual1input118'), '-6')
WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Return to top_markComplete'))
WebUI.acceptAlert()
WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume'))
WebUI.verifyTextPresent("The value you specify does not match the value", false)
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume_1'))
WebUI.verifyTextPresent("Your data has been saved and the CRF was marked complete", false)

// DE2 event B2
WebUI.setText(findTestObject('Page_OpenClinica/input_Support_findSubjects_f_studySubjectlabel'), Subject_Q)
WebUI.click(findTestObject('Page_OpenClinica/input_Support_navSearchButton'))
WebUI.setText(findTestObject('Page_OpenClinica/input_Page 1 of 1_ebl_filterKeyword'), Subject_Q_Ev_B2)
WebUI.click(findTestObject('Page_OpenClinica/input_Page 1 of 1_button_search'))
WebUI.click(findTestObject('Page_OpenClinica/img_v1_bt_EnterData1'))

WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Item response_type text and data_type INT_input119'), '-7')
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Return to top_submittedResume'))
WebUI.verifyTextPresent("The value you specify does not match the value", false)
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Return to top_submittedResume'))
WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_INT_IG_T014D_REPGROUP_0input118'),	'-8')
WebUI.setText(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_INT_IG_T014D_REPGROUP_manual1input118'), '-9')
WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Return to top_markComplete'))
WebUI.acceptAlert()
WebUI.click(findTestObject('Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume'))
WebUI.verifyTextPresent("The value you specify does not match the value", false)
WebUI.click(findTestObject('Object Repository/Page_OpenClinica Double Data Entry/input_Mark CRF Complete_submittedResume_1'))
WebUI.verifyTextPresent("Your data has been saved and the CRF was marked complete", false)

WebUI.click(findTestObject('Page_OpenClinica/a_Log Out'))
WebUI.closeBrowser()