package com.epam.calculator;
import java.util.Scanner;
import com.epam.calculator.addition;
import com.epam.calculator.subtraction;
import com.epam.calculator.multiplication;
import com.epam.calculator.division;
public class App 
{
    public static void main( String[] args )
    {
    	division ob=new division();
        System.out.println( "Select your operation" );
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your option");
        int op=sc.nextInt();
        System.out.println("Enter a and b values");		
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        switch(op)
        {
        case 1:ob.add(a, b);
        break;
        case 2:ob.sub(a, b);
        break;
        case 3:ob.mul(a, b);
        break;
        case 4:ob.div(a, b);
        break;
        default:
        	System.out.println("Enter a valid option");
        }
    }
}
