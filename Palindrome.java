import java.io.*;
import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        int n, sum=0, r, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        n = sc.nextInt();
        sc.close();
        temp=n;
        while(n>0){
            r= n%10;
            sum= (sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
        }
}