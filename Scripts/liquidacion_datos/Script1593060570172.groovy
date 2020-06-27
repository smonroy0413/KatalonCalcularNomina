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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.calculadoralaboral.co/')

WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/a_Comenzar mi liquidacin'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Nombre y Apellidos_terminationemployee_name'), nombre)

WebUI.click(findTestObject('Page_Calculadora de Liquidacin Laboral Gratuita/span_Cdula de ciudadana_select2-selection__arrow'))

WebUI.setText(findTestObject('Page_Calculadora de Liquidacin Laboral Gratuita/input__select2-search__field'), 'Registro')

WebUI.sendKeys(findTestObject('Page_Calculadora de Liquidacin Laboral Gratuita/input__select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_No de documento_terminationemployee_d_0fc08c'), documento)

WebUI.setText(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Causa de liquidacin_terminationcause'), motivo)

//WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_No_terminationcompensation'))

ValorRadio = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_No_terminationcompensation'), 'value', 'equals', 'false', true)

WebUI.click(ValorRadio)

//WebUI.takeScreenshot('Test\\screenshot.png')
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Fecha de contratacin_terminationhire_date'))

//WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_2019'))

Nuyear = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_2019'), 'text', 'equals', '2019', true)

WebUI.click(Nuyear)

//WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_Ene'))

NuMes = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_Ene'), 'text', 'equals', 'Ene', true)

WebUI.click(NuMes)

//WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/td_10'))

NuDia = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/td_10'), 'text', 'equals', '11', true)

WebUI.click(NuDia)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Fecha de liquidacin_terminationend_date'))

//WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_2019'))

NuYearLi = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_2020'), 'text', 'equals', '2019', true)

//WebUI.mouseOver(NuYearLi)

WebUI.click(NuYearLi)

//WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_Dic'))

NuMesLi = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_Dic'), 'text', 'equals', 'Ene', true)

WebUI.click(NuMesLi)

//WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/td_31'))

NuDiaLi = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/td_31'), 'text', 'equals', '31', true)

WebUI.click(NuDiaLi)

WebUI.setText(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Das de vacaciones pendientes de pago__7f2237'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Salario Base_terminationsalary'), 
    '1.500.000')

WebUI.setText(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Prestamos pendientes_terminationloans'), 
    '200.000')

WebUI.click(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Deducciones pendientes_terminationdeductions'))

//WebUI.takeScreenshot('Test\\screenshot1.png')
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/input_Prestamos pendientes_terminationloans'), 3)

//WebUI.takeScreenshot('Test\\screenshot2.png')
WebUI.takeScreenshot()

def total = WebUI.getText(findTestObject('Object Repository/Page_Calculadora de Liquidacin Laboral Gratuita/span_ 2937805'))

println(total)

WebUI.closeBrowser()

