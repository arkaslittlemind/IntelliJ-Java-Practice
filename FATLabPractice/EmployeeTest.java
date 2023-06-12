package FATLabPractice;

class NegativeSalaryException extends Exception {
    public NegativeSalaryException(String message) {
        super(message);
    }
}
class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) throws NegativeSalaryException {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary <= 0) {
            throw new NegativeSalaryException("Monthly salary must be positive");
        }
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) throws NegativeSalaryException {
        if (monthlySalary <= 0) {
            throw new NegativeSalaryException("Monthly salary must be positive");
        }
        this.monthlySalary = monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void applyRaise(double percentage) {
        monthlySalary *= (1 + percentage / 100);
    }
}

public class EmployeeTest {
    public static void main(String[] args) throws NegativeSalaryException {
        try {
            Employee employee1 = new Employee("Yash", "Runnoo", -32000);
            Employee employee2 = new Employee("Arkadipta", "Mojumder", 30000);

            System.out.println("Yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() + ": " +
                    employee1.getYearlySalary());
            System.out.println("Yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() + ": " +
                    employee2.getYearlySalary());

            employee1.applyRaise(10);
            employee2.applyRaise(10);

            System.out.println("\nAfter 10% raise:");
            System.out.println("Yearly salary for " + employee1.getFirstName() + " " + employee1.getLastName() + ": " +
                    employee1.getYearlySalary());
            System.out.println("Yearly salary for " + employee2.getFirstName() + " " + employee2.getLastName() + ": " +
                    employee2.getYearlySalary());

        } catch (NegativeSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
