package Super_Constructor;

public class VicePrecident extends Manager {

    VicePrecident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi, " + name + ", My Name Is VP" + this.name);
    }
}
