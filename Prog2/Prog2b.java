package School.Project_Term2;


/* WAP to display the following series:
   S = 0 + 3 - 8 + 15 - 24 + 35 - 48 + ... n terms */
import java.util.*;
public class Prog2b
{
    public static void Series()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Terms");
        int n=sc.nextInt();
        System.out.print("S = 0");
        
        int d,s=0;
        for(int i=2; i<=n; i++)
        {
            d=(i*i)-1;
            
            if(d%2==0)
            {
                System.out.print(" - " + d);
                s=s-d;
            }
            else
            {
                System.out.print(" + " + d);
                s=s+d;
            }
        }
        System.out.print("\nS = " + s);
    }
}
