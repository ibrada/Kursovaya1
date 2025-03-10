public class EmployeeBook {

    private static final Employee[] EMPLOYEES = new Employee[10];

    public EmployeeBook() {
    }

    public static Employee[] getEmployees() {
        return EMPLOYEES;
    }

    public void print() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            System.out.println(EMPLOYEES[i]);
        }
    }

    public void printFullName() {
        for (int i = 0; i < EmployeeBook.EMPLOYEES.length; i++) {
            System.out.println(EmployeeBook.EMPLOYEES[i].getFullName());
        }
    }

    public int sumSalary() {
        int sum = 0;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            sum = sum + EMPLOYEES[i].getSalary();
        }
        return sum;
    }

    public Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        int maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getSalary() > maxSalary) {
                maxSalary = EMPLOYEES[i].getSalary();
                employeeWithMaxSalary = EMPLOYEES[i];
            }
        }
        return employeeWithMaxSalary;
    }

    public Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getSalary() < minSalary) {
                minSalary = EMPLOYEES[i].getSalary();
                employeeWithMinSalary = EMPLOYEES[i];
            }
        }
        return employeeWithMinSalary;
    }

    public int averageSalary() {
        if (EMPLOYEES.length == 0) {
            return 0;
        }
        return sumSalary() / EMPLOYEES.length;
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i] == null) {
                EMPLOYEES[i] = employee;
                return;
            }
        }
        System.out.println("Вакансий нет");
    }

    public Employee findEmployeeById(int id) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getId() == id) {
                return EMPLOYEES[i];
            }
        }
        return null;
    }

    public void deleteEmployeeById(int id) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (EMPLOYEES[i].getId() == id) {
                EMPLOYEES[i] = null;
                return;
            }
        }
        System.out.println("Сотрудников нет");
    }
}