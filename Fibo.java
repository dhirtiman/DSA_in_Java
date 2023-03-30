public class Fibo {

    public static void main(String[] args) {
        int f1,f2,temp;
        f1 = 0 ; f2 = 1;
        System.out.print(f1+" "+f2+" ");

        while (f2 < 1000) {
            temp = f2;
            f2 +=f1;
            f1 = temp;
            System.out.print(f2+" ");
        }
    }
    
}
