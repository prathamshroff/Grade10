package School.Project_Term2;

import java.util.*;
public class Prog9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose any one :");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter the Temp. (in degree Celsius)");
            int c=sc.nextInt();
            System.out.println("Fahrenheit = " + C2F(c));
            break;
            case 2:
            System.out.println("Enter the Temp. (in degree Fahrenheit)");
            int f=sc.nextInt();
            System.out.println("Celsius = " + F2C(f));
            break;
            default:
            System.out.println("Invalid Choice");
            System.out.println("Please Try Again");
            main();
        }
    }
    public static double C2F(int c)
    {
        double F=1.8*c+32;
        return F;
    }
    public static double F2C(int f)
    {
        double C=5/9*(f-32);
        return C;
    }
}
