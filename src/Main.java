import org.w3c.dom.ls.LSOutput;

public class Main {

    private static void line(String line) {
        System.out.println("--- " + line.toUpperCase() + " ---");
    }

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        Employee employee = new Employee("Ivan", 1, 10000);
        Employee employee1 = new Employee("Petr", 2, 20000);
        Employee employee2 = new Employee("Mike", 3, 11000);
        Employee employee3 = new Employee("David", 4, 15000);
        Employee employee4 = new Employee("Jack", 5, 12000);
        Employee employee5 = new Employee("Jane", 1, 18000);
        Employee employee6 = new Employee("Bob", 2, 15000);
        Employee employee7 = new Employee("John", 3, 16000);
        Employee employee8 = new Employee("Mike", 4, 17000);
        Employee employee9 = new Employee("Sam", 5, 13000);

        line("добавление сотрудников");
        employeeBook.addEmployee(employee);
        employeeBook.addEmployee(employee1);
        employeeBook.addEmployee(employee5);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee3);
        line("вывод в консоль");
        employeeBook.print();
        line("удаление сотрудника по id");
        employeeBook.deleteEmployeeById(2);
        line("вывод в консоль");
        employeeBook.print();
        line("добавление сотрудника");
        employeeBook.addEmployee(employee4);
        line("вывод в консоль");
        employeeBook.print();
        line("заполнение всего массива");
        employeeBook.addEmployee(employee6);
        employeeBook.addEmployee(employee7);
        employeeBook.addEmployee(employee8);
        employeeBook.addEmployee(employee9);
        employeeBook.addEmployee(employee5);
        line("только имена");
        employeeBook.printFullName();
        line("сумма всех зарплат");
        System.out.println(employeeBook.sumSalary());
        line("максмальная зарплата");
        System.out.println(employeeBook.findEmployeeWithMaxSalary());
        line("минимальная зарплата");
        System.out.println(employeeBook.findEmployeeWithMinSalary());
        line("средняя зарплата");
        System.out.println(employeeBook.averageSalary());
        line("поиск по id");
        System.out.println(employeeBook.findEmployeeById(9));

    }


}