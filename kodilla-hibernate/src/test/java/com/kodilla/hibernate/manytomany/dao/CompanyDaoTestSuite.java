//package com.kodilla.hibernate.manytomany.dao;
//
//import com.kodilla.hibernate.manytomany.Company;
//import com.kodilla.hibernate.manytomany.Employee;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class CompanyDaoTestSuite {
//
//    @Autowired
//    private CompanyDao companyDao;
//    @Autowired
//    private EmployeeDao employeeDao;
//
//    @Test
//    void testSaveManyToMany() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        //When
//        companyDao.save(softwareMachine);
//        int softwareMachineId = softwareMachine.getId();
//        companyDao.save(dataMaesters);
//        int dataMaestersId = dataMaesters.getId();
//        companyDao.save(greyMatter);
//        int greyMatterId = greyMatter.getId();
//
//        //Then
//        assertNotEquals(0, softwareMachineId);
//        assertNotEquals(0, dataMaestersId);
//        assertNotEquals(0, greyMatterId);
//
//        //CleanUp
//        //try {
//        //    companyDao.deleteById(softwareMachineId);
//        //    companyDao.deleteById(dataMaestersId);
//        //    companyDao.deleteById(greyMatterId);
//        //} catch (Exception e) {
//        //    //do nothing
//        //}
//
//    }
//
//    @Test
//    void NamedQueries() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee janKovalsky = new Employee("Jan", "Kovalsky");
//        Employee AngelinaNovak = new Employee("Angelina", "Novak");
//        Employee MichaelSmith = new Employee("Michael", "Smith");
//
//        Company kodilla = new Company("Kodilla");
//        Company kodillaPlus = new Company("Kodilla Plus");
//        Company modernMachines = new Company("Modern Machines");
//
//        johnSmith.getCompanies().add(kodilla);
//        johnSmith.getCompanies().add(kodillaPlus);
//        johnSmith.getCompanies().add(modernMachines);
//
//        kodilla.getEmployees().add(johnSmith);
//        kodilla.getEmployees().add(janKovalsky);
//        kodilla.getEmployees().add(AngelinaNovak);
//        kodilla.getEmployees().add(MichaelSmith);
//
//        employeeDao.save(johnSmith);
//        int id = johnSmith.getId();
//        companyDao.save(kodilla);
//        int id1 = kodilla.getId();
//
//        //When
//        List<Employee> employeeSmithList = employeeDao.retrieveEmployeeWithLastname("Smith");
//        List<Company> companiesListStartWith = companyDao.retrieveCompanyWithNameStartWith("Kod%");
//
//        //Then
//        try {
//            assertEquals(2, employeeSmithList.size());
//            assertEquals(2, companiesListStartWith.size());
//        } finally {
//            //CleanUp
////            companyDao.deleteById(id1);
////            employeeDao.deleteById(id);
//        }
//
//    }
//}
