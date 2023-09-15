package package2_OpenClosedPrinciple.example1;

public abstract class Employee {
    private String name;
    private String department;
    private boolean isWorking;

    public Employee(String name, String department, boolean isWorking) {
        this.name = name;
        this.department = department;
        this.isWorking = isWorking;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }
}
