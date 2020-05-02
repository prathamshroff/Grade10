package School.Project_Term2;


// WAP to display the following series:
// S = 1 + 2 + 3 + 5 + 8 + 13 + 21

public class Prog2a
{
    public static void Series()
    {
        System.out.print("S = 1");
        int a=1,b=1,c,n=1,s=1;
        
        while(n<7)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" + " + c);
            s=s+c;
            n++;
        }
        System.out.print("\nS = "  + s);
    }
}
