package package1_SingleResponsibilityPrinciple.example1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ioana", 23,2500);
        Person person2 = new Person("Dan", 35,3500);
        Person person3 = new Person("Denisa", 40,2900);

        HR hr = new HR(3000);

        hr.hire(person1);
        System.out.println("----------------");
        hr.hire(person2);
        System.out.println("----------------");
        hr.hire(person3);
        System.out.println("----------------");



    }
}
