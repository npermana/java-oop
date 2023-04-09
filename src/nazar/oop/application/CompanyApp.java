package nazar.oop.application;

import nazar.oop.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        System.out.println("Demo Inner Class");

        Company company = new Company();
        company.setName("Development Company");

        Company.Employee employee = company.new Employee();
        employee.setName("Nazar");

        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

        Company company2 = new Company();
        company2.setName("Anonymous");
        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Dev");
        System.out.println(employee2.getCompany());
        System.out.println(employee2.getName());
    }
}
