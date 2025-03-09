public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Ivan", 1, 10000);
        employees[1] = new Employee("Petr", 2, 20000);
        employees[2] = new Employee("Mike", 3, 11000);
        employees[3] = new Employee("David", 4, 15000);
        employees[4] = new Employee("Jack", 5, 12000);
        employees[5] = new Employee("Jane", 1, 18000);
        employees[6] = new Employee("Bob", 2, 15000);
        employees[7] = new Employee("John", 3, 16000);
        employees[8] = new Employee("Mike", 4, 17000);
        employees[9] = new Employee("David", 5, 13000);

        print();
        printFullName();
        System.out.println(sumSalary());
        System.out.println(findEmployeeWithMaxSalary());
        System.out.println(findEmployeeWithMinSalary());
        System.out.println(averageSalary());
    }

    private static void print() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    private static int sumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }

    private static int averageSalary() {
        if (employees.length == 0) {
            return 0;
        }
        return sumSalary() / employees.length;
    }



}