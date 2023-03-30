import java.util.*;

public class Salary {
    public static void main(String[] args) {
        Double salary;
        Scanner sc  = new Scanner(System.in);
        salary = sc.nextDouble();
        
        System.out.println("Salary before bonus: "+String.format("%.0f", salary));

        if (salary > 10000) 
        {
            salary+=2000;    
        } else {
            salary+=1000;
        }

        System.out.print("Salary after Bonus: ");
        System.out.println(String.format("%.0f", salary));
        sc.close();
    }
    
}
