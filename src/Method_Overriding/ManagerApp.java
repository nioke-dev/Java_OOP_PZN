package Method_Overriding;

public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");

        VicePrecident vp = new VicePrecident();
        vp.name = "joko";
        vp.sayHello("joko");
    }
}
