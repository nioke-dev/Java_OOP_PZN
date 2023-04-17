package Method;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Eko";
        person1.address = "Subang";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Budi");
        Person person3;
        person3 = new Person();
        person3.sayHello("Budi");
        // jika object yang dipanggil tidak di declarer terlebuh dahulu maka akan
        // menghasilkan null
    }
}
