package Constructor;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Eko", "Subang");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.SayHello("Budi");

        Person person2 = new Person("budi", "Jakarta");

        Person person3;
        person3 = new Person("Joko", "Cirebon");
        person3.SayHello("Budi");
    }
}
