package Labrecord;

import java.util.Scanner;

public class Lab10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a,b;
		int result;
		char symbol;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		a=obj.nextInt();
		
		System.out.println("Enter the second number");
		b=obj.nextInt();
		
		System.out.println("Enter the operator");
		symbol=obj.next().charAt(0);
		
		switch(symbol)
		{
		case'+':result=a+b;
		      System.out.println("the addition of two number is"+result);
		      break;
		      
		case'-':result=a-b;
		         System.out.println("the subtraction of two number is"+result);
		         break;
		         
		  case'*':result=a*b;
		          System.out.println("the multiplication of two number is"+result);
		          break;
		          
		  case'/':result=a/b;
		          System.out.println("the division of two number is"+result);
		          break;
		          
		         default:System.out.println("you entered wrong symbol");
		               break;
		               
		         
		}
		// TODO Auto-generated method stub

	}

}
