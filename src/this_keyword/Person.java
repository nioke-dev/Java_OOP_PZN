package this_keyword;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String paramName, String paramAddress) {
        this.name = paramName;
        this.address = paramAddress;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void SayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + this.name);
    }
}
