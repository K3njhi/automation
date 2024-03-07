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

WebUI.setText(findTestObject('user settings/address_fname_textbox'), 'test')

WebUI.setText(findTestObject('user settings/address_lname_textbox'), 'ken27')

WebUI.setText(findTestObject('user settings/address_textbox'), 'dyan lang')

WebUI.setText(findTestObject('user settings/city_textbox'), 'dito lang')

WebUI.setText(findTestObject('user settings/postalcode_textbox'), '5022')

WebUI.setText(findTestObject('user settings/state_textbox'), 'state')

WebUI.click(findTestObject('user settings/country_dd'))

WebUI.selectOptionByLabel(findTestObject('user settings/country_dd'), 'Philippines', false)

WebUI.click(findTestObject('user settings/country_dd'))

WebUI.click(findTestObject('user settings/add_address_button'))

WebUI.scrollToElement(findTestObject('user settings/address_container'), 0)

WebUI.waitForElementVisible(findTestObject('user settings/address_container'), 0)

