import java.io.*;
import java.util.*;
public class EvenOdd {
    public static void main (String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        n = sc.nextInt();
        sc.close();
        if(n%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");        
        }
    }
    
}
