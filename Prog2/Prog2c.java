package School.Project_Term2;

/* WAP to display the following series:
   S = 1/2! + 3/4! + 5/6! ... n terms */
import java.util.*;
public class Prog2c
{
    public static void Series()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Terms");
        int n=sc.nextInt();
        System.out.print("S =");
        
        int a=1,b=2;
        double s=0.0;
        for(int i=1;i<=n;i++)
        {
            s=s+(double)a/(fact(b));
            
            if (i==1)
            System.out.print(" ");
            else
            System.out.print(" + ");
            System.out.print(a + "/" + b +"!");
            a=a+2;
            b=b+2;
        }
        System.out.print("\nS = " + s);
    }
    public static int fact(int n)
    {
        int f=1,i;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        return(f);
    }
}

