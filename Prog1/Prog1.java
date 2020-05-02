package School.Project_Term2;


// WAP to enter anumber and check whether it is an Armstrong no. or not.
// A number is a Armstrong no. if the sum of the cube of the digits is equal to the number.
import java.util.*;
public class Prog1
{
    public static void Armstrong()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        
        int d,s=0,n1=n;
        while(n>0)
        {
            d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        
        if(n1==s)
        System.out.println(n1+" is an Armstrong Number");
        else
        System.out.println(n1+" is not an Armstrong Number");
    }
}
