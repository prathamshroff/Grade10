package School.Project_Term2;

import java.util.Scanner;
public class Prog8
{
    public static void main()
    {
        int s,f;
        System.out.println("Perfect Numbers between 1 and 100 are:");
        for (int i=1;i<100;i++)
        {
            s=0;
            for(f=1;f<i;f++)
            {
                if(i%f==0)
                s=s+f;  
            }
            if(s==i)
            System.out.println(i);
        }
    }
}