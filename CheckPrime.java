import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int n, prime = 1;
        String res = "Not prime";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        if (n != 1 && n != 0) {

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = 0;
                    break;
                }
            }
            if (prime == 0)
                res = "Not prime";
            else
                res = "Prime";
        }

        System.out.println(n + " is " + res);

        sc.close();

    }

}
