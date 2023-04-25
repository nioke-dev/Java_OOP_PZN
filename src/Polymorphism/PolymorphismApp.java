package Polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new VicePrecident("Eko");
        employee.sayHello("Budi");
    }
}
