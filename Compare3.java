import java.util.Scanner;

public class Compare3 {
    public static void main(String[] args) {
        int a, b, c, l = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        if (a > b) {
            if (a > c) {
                l = a;
            } else {
                l = c;
            }
        }
        if (a < b) {
            if (b < c) {
                l = c;
            } else {
                l = b;
            }
        }
        System.out.println(l + " is the largest");
        s.close();
    }

}
