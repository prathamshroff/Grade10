package School.Project_Term2;


//Amicable Numbers
import java.util.*;
class Prog6
{
     public static void main()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Numbers");
         int n=sc.nextInt();
         int m=sc.nextInt();
         int s=0,t=0;
         for(int i=1;i<=n;i++)
         {
             if(n%i==0)
             {
                  s=s+i;
             }
         }
         for(int j=1;j<=m;j++)
         {
             if(m%j==0)
             {
                  t=t+j;
             }
         }
         if(s==t)
         System.out.println("AN AMICABLE PAIR");
         else
         System.out.println("NOT AN AMICABLE PAIR");
     }
}