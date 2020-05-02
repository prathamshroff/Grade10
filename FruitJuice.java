package School.Project_Term2;

import java.util.*;
public class FruitJuice
{
    int product_code, pack_size, product_price;
    String flavor, pack_type;
    FruitJuice()
    {
        product_code=0;
        pack_size=0;
        product_price=0;
    }
    void input(int pc,int ps,int pp,String f,String pt)
    {
        product_code=pc;
        pack_size=ps;
        product_price=pp;
        flavor=f;
        pack_type=pt;
    }
    void discount()
    {
        product_price=(product_price*90)/100;
    }
    void display()
    {
        System.out.println("Product Code = " + product_code);
        System.out.println("Flavor = " + flavor);
        System.out.println("Pack Type = " + pack_type);
        System.out.println("Pack Size = " + pack_size + "ml");
        System.out.println("Product Price = Rs." + product_price);
    }
    public static void main()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Product Code");
        int pc=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter Flavor");
        String f=s2.nextLine();
        Scanner s3=new Scanner(System.in);
        System.out.println("Enter Pack Type");
        String pt=s3.nextLine();
        Scanner s4=new Scanner(System.in);
        System.out.println("Enter Pack Size");
        int ps=s4.nextInt();
        Scanner s5=new Scanner(System.in);
        System.out.println("Enter Product Price");
        int pp=s5.nextInt();
        FruitJuice obj=new FruitJuice();
        obj.input(pc,ps,pp,f,pt);
        obj.discount();
        obj.display();
    }
}