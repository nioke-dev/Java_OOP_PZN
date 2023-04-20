package variable_shadowing;

public class Person {
    String name;
    String address;

    Person(String name, String address) {
        name = name; // field nama tidak berubah
        address = address; // field address tidak berubah
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + name); // field name tidak diakses
    }
}
