import java.util.Scanner;

public class AddTwo {

    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        num2 = scanner.nextInt();
        num1 = scanner.nextInt();
        sum = num1 + num2 ;
        System.out.println("sum: "+sum);

        scanner.close();
    }
}
