package School.Project_Term2;

// WAP to find GCD of two numbers.
import java.util.*;
public class Prog3
 { 
     public static void main()
     { 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Numbers");
         int number1 = sc.nextInt();
         int number2 = sc.nextInt();
         System.out.println("GCD of two numbers " + number1 +" and " + number2 +" is :" + findGCD(number1,number2));
     } 
     public static int findGCD(int number1, int number2) 
     {
         if(number2 == 0)
         { 
             return number1; 
         }
         return findGCD(number2, number1%number2); 
     } 
} 

