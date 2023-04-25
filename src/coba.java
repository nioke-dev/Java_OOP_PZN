import java.text.DecimalFormat;
import java.util.Scanner;

public class coba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Complete this line
            DecimalFormat df = new DecimalFormat("000");
            String c = df.format(x);
            System.out.println(String.format("%" + -15 + "s", s1) + c);
        }
        System.out.println("================================");
    }
}
