public class Main {

    private static void line() {
        System.out.println("* * *");
    }

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        EmployeeBook.getEmployees()[0] = new Employee("Ivan", 1, 10000);
        EmployeeBook.getEmployees()[1] = new Employee("Petr", 2, 20000);
        EmployeeBook.getEmployees()[2] = new Employee("Mike", 3, 11000);
        EmployeeBook.getEmployees()[3] = new Employee("David", 4, 15000);
        EmployeeBook.getEmployees()[4] = new Employee("Jack", 5, 12000);
        EmployeeBook.getEmployees()[5] = new Employee("Jane", 1, 18000);
        EmployeeBook.getEmployees()[6] = new Employee("Bob", 2, 15000);
        EmployeeBook.getEmployees()[7] = new Employee("John", 3, 16000);
        EmployeeBook.getEmployees()[8] = new Employee("Mike", 4, 17000);
        EmployeeBook.getEmployees()[9] = new Employee("David", 5, 13000);

        employeeBook.print();
        line();
        employeeBook.printFullName();
        line();
        System.out.println(employeeBook.sumSalary());
        line();
        System.out.println(employeeBook.findEmployeeWithMaxSalary());
        line();
        System.out.println(employeeBook.findEmployeeWithMinSalary());
        line();
        System.out.println(employeeBook.averageSalary());
    }







}