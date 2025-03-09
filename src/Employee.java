import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private int id;
    private static int counter = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getDepartment() == employee.getDepartment() && getSalary() == employee.getSalary() && Objects.equals(getFullName(), employee.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), getDepartment(), getSalary());
    }

    @Override
    public String toString() {
        return fullName + " " + department + " " + salary + " " + id;
    }
}
