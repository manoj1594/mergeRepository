package cjc.calculator.client;
import java.util.Scanner;

import com.cjc.calculator.services.Calculator;

public class TestA { 
	                 public void scan()
	                 {      
	                	 Scanner sc=new Scanner(System.in);
	                	   System.out.println("please select operation");
	                	   System.out.println("1 for add");
	                	   System.out.println("2 for sub");
	                	   System.out.println("3 for mul");
	                	   System.out.println("4 for div");
	                	   int i=sc.nextInt();
	                	   int s=i;
	                	   Calculator cal=new Calculator();
	                	   switch (s)
	                	   {
	                	   case 1:
	                		       cal.add();
	                		       scan();
	                		    break;
	                	   case 2:
	                		       cal.sub();
	                		       scan();
	                		    break;
	                	   case 3:
	                		       cal.mul();
	                		       scan();
	                		   break;
	                	   case 4:
	                		        cal.div();
	                		        scan();
	                		   break;
	                	   default:
	                		   System.out.println("invalid");
	                		   
	                	   
	                	   }
	                 }
                   public static void main(String args[])
                   
                   {
                	   TestA a=new TestA();
                	      a.scan();
                   
                   }
}
