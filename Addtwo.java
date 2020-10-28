import java.io.*;
import java.util.*;
public class Addtwo {
    public static void main(String[] args){
        int a, b, sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sc.close();
        sum = a+b;
        System.out.println("The sum of two numbers is: "+sum);
    }
    
}
