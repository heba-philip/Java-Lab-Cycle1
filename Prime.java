import java.io.*;
import java.util.*;
public class Prime {
    public static void main(String[] args){
        int n, i, temp;
        boolean isPrime= true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        n = sc.nextInt();
        sc.close();
        for(i=2;i<=n/2;i++){
            temp=n%i;
            if(temp==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");

    }
    
}
