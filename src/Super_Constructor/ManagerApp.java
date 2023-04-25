package Super_Constructor;

import Method_Overriding.VicePrecident;

public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");

        Super_Constructor.VicePrecident vp = new VicePrecident();
        vp.name = "joko";
        vp.sayHello("joko");
    }
}
