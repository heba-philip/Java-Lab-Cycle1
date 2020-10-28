import java.io.*;
import java.util.*;
public class SumOfN {
    public static void main(String[] args){
        int n, i, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n = sc.nextInt();
        sc.close();
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of "+n+" numbers is "+sum);
    }
    
}
