import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int n,flag=0;
        String res;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();

        for (int i = 2; i <= n ; i++) {
            if (n%i==0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) res = "Not prime";
        else res = "Prime";

        System.out.println(n+" is "+res);

        sc.close();


    }
    
}
