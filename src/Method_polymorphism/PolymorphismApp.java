package Method_polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new VicePrecident("Eko");
        employee.sayHello("Budi");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("joko"));
        sayHello(new VicePrecident("budi"));
        // contoh polymorphism diatas
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
