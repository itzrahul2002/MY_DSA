import java.util.Scanner;

public class Prime_Number {
    static void isPrime(int n){
        int count=0;
        for (int i = 1; i <=n;i++){
            if(n%i==0)
                count++;
        }
        if(count==2){
            System.out.println("Prime");
        }
        else
            System.out.println("Not prime");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        isPrime(n);
    }
}
