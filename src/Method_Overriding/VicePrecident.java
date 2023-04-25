package Method_Overriding;

public class VicePrecident extends Manager {
    void sayHello(String name) {
        System.out.println("Hi, " + name + ", My Name Is VP" + this.name);
    }
}
