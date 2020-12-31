package com.cjc.calculator.services;

import java.util.Scanner;

public class Calculator { 
	                        Scanner sc=new Scanner(System.in);
	                     
	                    public void add()
	                    {
	                    	 System.out.println("enter first digit");
		                      int a=sc.nextInt();
		                      System.out.println("enter second digit");
	                          int b=sc.nextInt();
	                    	int c=a+b;
	                    	System.out.println(c);
	                    }
	                    public void sub()
	                    {
	                    	System.out.println("enter first digit");
		                      int a=sc.nextInt();
		                      System.out.println("enter second digit");
	                          int b=sc.nextInt();
	                    	int c=a-b;
	                    	System.out.println(c);
	                    }
	                    
	                    public void mul()
	                    {
	                    	System.out.println("enter first digit");
		                      int a=sc.nextInt();
		                      System.out.println("enter second digit");
	                          int b=sc.nextInt();
	                    	int c=a*b;
	                    	System.out.println(c);
	                    }
	                    public void div()
	                    {
	                    	 System.out.println("enter first digit");
		                      int a=sc.nextInt();
		                      System.out.println("enter second digit");
	                          int b=sc.nextInt();
	                    	int c=a/b;
	                    	System.out.println(c);
	                    }
	                    


}
