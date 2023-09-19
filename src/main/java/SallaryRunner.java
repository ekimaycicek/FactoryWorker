public class SallaryRunner {

    public static void main(String[] args) {

        SalaryCalculation_Employee employee = new SalaryCalculation_Employee("Drake",20000,41,2020);
        System.out.println("employee.name = " + employee.name);
        System.out.println("employee.salary = " + employee.salary);
        System.out.println("Tax payable = " + employee.tax() + "$");
        System.out.println("bonus to be paid = " + employee.bonus());

        System.out.println("employee.raiseSalary() = " + employee.raiseSalary());
        System.out.println("employee.salary+ employee.raiseSalary() = " + ((employee.salary) + (employee.raiseSalary())));
        System.out.println("employee.toString() = " + employee.toString());

    }

}
