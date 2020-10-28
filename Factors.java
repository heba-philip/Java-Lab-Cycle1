import java.io.*;
import java.util.*;
public class Factors {
    public static void main (String[] args){
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+ "");
            }
        }

    }
    
}
