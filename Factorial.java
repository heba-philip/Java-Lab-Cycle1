import java.io.*;
import java.util.*;
public class Factorial {
    public static void main (String[] args){
        int n, fact=1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term:");
        n=sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            fact= fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
    
}
