package package1_SingleResponsibilityPrinciple.example1;

public class Person {
    private String name;
    private int age;
    private int desiredSalary;

    public Person(String name, int age, int desiredSalary) {
        this.name = name;
        this.age = age;
        this.desiredSalary = desiredSalary;
    }

    public int getDesiredSalary() {
        return desiredSalary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", desiredSalary=" + desiredSalary +
                '}';
    }
}
