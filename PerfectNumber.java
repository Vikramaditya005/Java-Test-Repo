import java.util.*;
public class PerfectNumber{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int sum=0;
        System.out.println("Enter the Number: ");
        int a=sc.nextInt();
        while(i<a){
            if(a % i==0){
                sum +=i;
            }
            i++;
        }
        if(sum==a){
            System.out.println(" It is a Perfect Number");

        }
        else
        System.out.println("It is not a perfect number");
    }
}