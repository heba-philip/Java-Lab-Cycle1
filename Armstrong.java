import java.io.*;
import java.util.*;
public class Armstrong {
    public static void main (String[] args){
        int n, r, arm, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        n = sc.nextInt();
        sc.close();
        arm=n;
        while(arm!=0){
            r=arm%10;
            sum=sum+(r*r*r);
            arm=arm/10;
        }
        if(sum==n){
            System.out.println("It is an Armstrong number.");
        }
        else{
            System.out.println("It is not an Armstrong number.");
        }
    }
    
}
