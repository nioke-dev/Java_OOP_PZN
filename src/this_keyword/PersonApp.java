package this_keyword;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Eko", "Subang");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.SayHello("Budi");

        Person person2 = new Person("budi");

        Person person3;
        person3 = new Person();
        person3.name = "Joko";
        person3.SayHello("Budi");

    }
}
