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
//import com.kms.katalon.keyword.excel.ExcelKeywords
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords

String excelFile01 = 'Data Files\\File01.xlsx'
ExcelKeywords.createExcelFile(excelFile01)
File file1 = new File(excelFile01)
assert file1.exists() == true
workbook01 = ExcelKeywords.getWorkbook(excelFile01)
ExcelKeywords.createExcelSheet(workbook01)
ExcelKeywords.createExcelSheets(workbook01, ['File01Sheet01', 'File01Sheet02'])
ExcelKeywords.saveWorkbook(excelFile01, workbook01)
//workbookFile01 = ExcelKeywords.getWorkbook(excelFile01)
workbook01 = ExcelKeywords.getWorkbook(excelFile01)
sheet01 = ExcelKeywords.getExcelSheet(workbook01, 'File01Sheet01')
ExcelKeywords.setValueToCellByIndex(sheet01, 0, 0, 'Fruites')
ExcelKeywords.setValueToCellByAddress(sheet01, 'B1', 'Price')
ExcelKeywords.setValueToCellByAddress(sheet01, 'B2', 10000)
ExcelKeywords.saveWorkbook(excelFile01, workbook01)