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

WebUI.navigateToUrl('file:///Users/michaltrunek/Documents/website/bike_shop_login_form.html')

WebUI.setText(findTestObject('Object Repository/Page_Bike Shop Login/input_Welcome to the Bike Shop_emailInput'), 'test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bike Shop Login/input_Please enter a valid email address_pa_f20ab1'), 
    'P9ET2sDE0SE=')

WebUI.setText(findTestObject('Object Repository/Page_Bike Shop Login/input_Welcome to the Bike Shop_emailInput'), 'test@test.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Bike Shop Login/input_Please enter a valid email address_pa_f20ab1'), 
    'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Page_Bike Shop Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Bike Shop Login/p_Incorrect login details'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Bike Shop Login/p_Incorrect login details'), 'Incorrect login details.')

