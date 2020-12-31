package cjc.calculator.client;
import java.util.Scanner;

import com.cjc.calculator.services.Calculator;

public class Test {
                   public static void main(String args[])
                   {
                	   Scanner sc=new Scanner(System.in);
                	   System.out.println("please select operation");
                	   System.out.println("1 for add");
                	   System.out.println("2 for sub");
                	   System.out.println("3 for mul");
                	   System.out.println("4 for div");
                	   int i=sc.nextInt();
                	   
                	   Calculator cal=new Calculator();
                	   switch (i)
                	   {
                	   case 1:
                		       cal.add();
                		    break;
                	   case 2:
                		       cal.sub();
                		    break;
                	   case 3:
                		       cal.mul();
                		   break;
                	   case 4:
                		        cal.div();
                		   break;
                	   default:
                		   System.out.println("invalid");
                		   
                	   
                	   }
                	   System.out.println("please select operation");
                	   System.out.println("1 for add");
                	   
                	   System.out.println("2 for sub");
                	   
                	   System.out.println("3 for mul");
                	   
                	   System.out.println("4 for div");
                   }
}
