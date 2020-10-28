import java.io.*;
import java.util.*;
public class Fibonnacci {
    public static void main (String[] args){
        int n, i, n1=0, n2=1, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number:");
        n= sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            System.out.print(n1+ ",");
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;   
        }

    }
    
}
