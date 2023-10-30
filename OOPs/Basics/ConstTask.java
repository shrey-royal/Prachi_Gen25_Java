class Employee {
    int employeeId;
    String employeeName;
    String employeeType; // "Hourly" or "Salaried"
    double hourlyWage;
    double hoursWorked;
    double monthlySalary;

    //Default Constructor
    Employee() {
        employeeId = 0;
        employeeName = null;
        employeeType = null;
        hourlyWage = 0.0;
        hoursWorked = 0.0;
        monthlySalary = 0.0;
    }

    //hourly employee
    Employee(int eId, String eName, double hWage, double hWorked) {
        employeeId = eId;
        employeeName = eName;
        employeeType = "Hourly";
        hourlyWage = hWage;
        hoursWorked = hWorked;
        monthlySalary = hourlyWage * hoursWorked;
    }

    //Salaried employee
    Employee(int eId, String eName, double salary) {
        employeeId = eId;
        employeeName = eName;
        employeeType = "Salaried";
        monthlySalary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Type: " + employeeType);
        if(employeeType.equals("Hourly")) {
            System.out.println("Hourly Wage: " + hourlyWage);
            System.out.println("Hours Worked: " + hoursWorked + " hours");
        }
        System.out.println("Monthly Salary: " + monthlySalary + "\n");
    }
}


public class ConstTask {
    public static void main(String[] args) {
        Employee hourlyEmployee = new Employee(1, "Hourly Employee", 500.0, 240.0);
        Employee salariedEmployee = new Employee(2, "Salaried Employee", 20000.0);

        System.out.println("Details of Hourly Employee:");
        hourlyEmployee.displayDetails();

        System.out.println("Details of Salaried Employee:");
        salariedEmployee.displayDetails();
    }
}

/*
Task:

Employee Payroll System: Build a Java program to calculate the monthly salary of employees using an Employee class. Create a default constructor to set basic employee details and a parameterized constructor to input hourly wage and hours worked for hourly employees, or a monthly salary for salaried employees.

Employee class

attributes:
    int employeeId;
    String employeeName;
    String employeeType; // "Hourly" or "Salaried"
    double hourlyWage;
    double hoursWorked;
    double monthlySalary;
*/