package Constructor_OverLoading;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        this.name = paramName;
        this.address = paramAddress;
    }

    Person(String paramName) {
        this.name = paramName;
    }

    Person() {

    }

    void SayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
