import java.util.Scanner;

public class QuadEQ {
    public static void main(String[] args) {
        int a,b,c;
        double D,r1,r2,rp,ip;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b and c of the Quadratic equation: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        D = Math.pow(b, 2) - 4*a*c;

        if (D>=0) {
            r1 = (-b+Math.sqrt(D))/(2*a);
            r2 = (-b-Math.sqrt(D))/(2*a);

            System.out.println("Roots are real and distict");
            System.out.println("Root_1: "+r1+"\nRoot_2: "+r2);
        }
        else{
            rp = (double) -b/(2*a);
            ip = Math.sqrt(-D)/(2*a);

            System.out.println("Root: "+rp+" + i"+ip);
        }

        sc.close();

    }
    
}
