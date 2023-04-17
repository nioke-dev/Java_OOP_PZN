package Field;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Eko";
        person1.address = "Subang";
        // person1.country = "Amerika"; ERROR

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();
        Person person3;
        person3 = new Person();
    }
}
