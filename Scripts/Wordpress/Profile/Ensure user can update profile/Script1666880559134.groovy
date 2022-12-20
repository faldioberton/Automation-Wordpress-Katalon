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
import com.github.javafaker.Faker as Faker

faker = new Faker(new Locale('in-ID'))

String firstName= faker.name().firstName()

String lastName = faker.name().lastName()

String displayName = ((firstName + lastName) + faker.number().digit())

String description = faker.book().title()

WebUI.setText(findTestObject('Profil Page/field_firstName'), firstName)

WebUI.setText(findTestObject('Profil Page/field_lastName'), lastName)

WebUI.setText(findTestObject('Profil Page/field_displayName'), displayName)

WebUI.setText(findTestObject('Profil Page/input_aboutMe'), description)

WebUI.verifyElementClickable(findTestObject('Profil Page/button_saveprofile'))

WebUI.click(findTestObject('Profil Page/button_saveprofile'))

WebUI.verifyElementText(findTestObject('Profil Page/notice_success'), 'Settings saved successfully!')

WebUI.verifyElementText(findTestObject('Profil Page/view_profile'), displayName)

WebUI.verifyElementAttributeValue(findTestObject('Profil Page/field_firstName'), 'value', firstName, 0)

