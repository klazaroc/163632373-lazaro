public class Employee {
    String employeeID;
    String name;
    double hourlyWage;
    double hoursWorked;

    public Employee(String employeeID, String name, double hourlyWage, double hoursWorked){
        this.employeeID = employeeID;
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(){
        return hoursWorked * hourlyWage;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Monthly Salary: " + calculateSalary());
    }

    public static void main(String[] args) {
        Employee em1 = new Employee("E001", "Alice Go", 15, 160);
        Employee em2 = new Employee("E002", "Bob Hann", 18, 150);

        em1.displayEmployeeDetails();
        System.out.println();

        em2.displayEmployeeDetails();
        System.out.println();
    }
}

    

