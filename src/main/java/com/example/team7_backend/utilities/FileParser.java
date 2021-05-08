package com.example.team7_backend.utilities;

import com.example.team7_backend.models.EmployeeInfo;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class FileParser {
    public static List readExcelFile(InputStream excelFile) throws Exception{
        Workbook workbook = new XSSFWorkbook(excelFile);

        Sheet sheet = workbook.getSheet("Team");
        Iterator<Row> rows = sheet.iterator();

        List<EmployeeInfo> lstEmp = new ArrayList();

        rows.next();
        while (rows.hasNext()) {
            Row currentRow = rows.next();

            Iterator<Cell> cellsInRow = currentRow.iterator();

            EmployeeInfo employeeInfo = new EmployeeInfo();
            int cellIndex = 0;
            while (cellsInRow.hasNext()) {
                Cell currentCell = cellsInRow.next();
                System.out.println(cellIndex);
                switch (cellIndex) {
                    case 0: {
                        employeeInfo.setName(currentCell.getStringCellValue());
                        break;
                    }
                    case 1: {
                        employeeInfo.setStartDate(currentCell.getDateCellValue());
                        break;
                    }
                    case 2: {
                        employeeInfo.setRole(currentCell.getStringCellValue());
                        break;
                    }
                    case 3: {
                        employeeInfo.setRoleLevel(currentCell.getStringCellValue());
                        break;
                    }
                    case 4: {
                        employeeInfo.setVendor(currentCell.getStringCellValue());
                        break;
                    }
                    case 5: {
                        employeeInfo.setProduct(currentCell.getStringCellValue());
                        break;
                    }
                    case 6: {
                        employeeInfo.setProductStartDate(currentCell.getDateCellValue());
                        break;
                    }
                    case 7: {
                        employeeInfo.setProductEndDate(currentCell.getDateCellValue());
                        break;
                    }
                    case 8: {
                        employeeInfo.setResourceProductStartDate(currentCell.getDateCellValue());
                        break;
                    }
                    case 9: {
                        employeeInfo.setResourceProductEndDate(currentCell.getDateCellValue());
                        break;
                    }
                    case 10: {
                        employeeInfo.setProductBuildLocation(currentCell.getStringCellValue());
                        break;
                    }
                    case 11: {
                        employeeInfo.setAnchor(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 12: {
                        employeeInfo.setWorkIntakeScoping(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 13: {
                        employeeInfo.setInterviewer(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 14: {
                        employeeInfo.setSecurityMaven(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 15: {
                        employeeInfo.setAccessibility(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 16: {
                        employeeInfo.setDevSecOps(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 17: {
                        employeeInfo.setEducationTrack(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 18: {
                        employeeInfo.setLocation(currentCell.getStringCellValue());
                        break;
                    }
                    case 19: {
                        employeeInfo.setContractor(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("C"));
                        break;
                    }
                    case 20: {
                        employeeInfo.setPersonOfColor(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 21: {
                        employeeInfo.setGender(currentCell.getStringCellValue());
                        break;
                    }
                    case 22: {
                        employeeInfo.setAvailableForOtherAreas(!currentCell.getStringCellValue().isEmpty() && currentCell.getStringCellValue().toUpperCase().equals("Y"));
                        break;
                    }
                    case 23: {
                        employeeInfo.setSkill1(currentCell.getStringCellValue());
                        break;
                    }
                    case 24: {
                        employeeInfo.setSkill2(currentCell.getStringCellValue());
                        break;
                    }
                    case 25: {
                        employeeInfo.setSkill3(currentCell.getStringCellValue());
                        break;
                    }
                    case 26: {
                        employeeInfo.setSkill4(currentCell.getStringCellValue());
                        break;
                    }
                    case 27: {
                        employeeInfo.setSkill5(currentCell.getStringCellValue());
                    }
                }
                cellIndex++;
            }

            lstEmp.add(employeeInfo);
        }

        // Close WorkBook
        workbook.close();
        List<EmployeeInfo> finalLstEmp = new ArrayList<>();
        for (EmployeeInfo emp: lstEmp) {
            if(!emp.getName().isEmpty() && !emp.getName().isBlank()) {
                finalLstEmp.add(emp);
            }
        }
        return finalLstEmp;

    }
}
