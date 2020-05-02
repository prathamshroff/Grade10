package School.Project_Term2;

import java.util.*;
public class Prog7
{
    public static void main()
    {
        int agi, tax_payable;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Annual Gross Income");
        agi=sc.nextInt();
        if(agi>=0 && agi<=100000)
        {
            tax_payable=0;
            System.out.print("Tax Payable = "+tax_payable);
        }
        else if(agi>100000 && agi<=500000)
        {
            tax_payable=1000+((agi-100000)*10)/100;
            System.out.print("Tax Payable = "+tax_payable);
        }
        else if(agi>500000 && agi<=800000)
        {
            tax_payable=45000+((agi-500000)*20)/100;
            System.out.print("Tax Payable = "+tax_payable);
        }
        else if(agi>800000)
        {
            tax_payable=110000+((agi-800000)*30)/100;
            System.out.print("Tax Payable = "+tax_payable);
        }
        else
        {
            System.out.println("Invalid Input, Please Try Again");
        }
        
    }
}
