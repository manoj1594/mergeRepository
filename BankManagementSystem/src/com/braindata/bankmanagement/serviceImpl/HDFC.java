package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.RBI;

public class HDFC implements RBI
	            	{
						Account acc=new Account();
						Scanner sc=new Scanner(System.in);
						int count=0;
						int balance=0;
   
   
						public void createAccount()
						{
			
			
							System.out.println("enter account no:");
		    
							String a=sc.next();
							acc.setAccNo(a);
		    
							System.out.println("Enter name:");
							String b=sc.next();
							acc.setName(b);
		    
							System.out.println("enter mobile no:");
							String c=sc.next();
							acc.setMobNo(c);
		    
							System.out.println("enter adhar no:");
							String d=sc.next();
							acc.setAdharNo(d);
		    
							System.out.println("enter gender:");
							String e=sc.next();
							acc.setGender(e);
		    
							System.out.println("enter age:");
							int f=sc.nextInt();
		    
		    
							if(f<=25)
							{
								System.out.println("your age is not eligible for account creation");
		    	
							}
							else
							{
		    
								acc.setAge(f);
		     
		    
		      
		  
		    
								System.out.println("enter balance amt:");
								double g=sc.nextDouble();
								while(g>0)
								{
									if(g>1000)
									{   
										System.out.println ("thank you.Your account is created successfully");
										acc.setBalance(g);
										break;
									}
									else
									{
		    	
										System.out.println("plese enter the balance value greater than 1000");
										System.out.println("please enter the balance");
										g=sc.nextDouble();
										acc.setBalance(g);
										balance++;
 		   
									}
		      
		  
								}
							}
		 
							count++;   
						}
						public void displayAllDetails()
						{
							if(count!=0)
							{	
								System.out.println("account no is: "+acc.getAccNo());
								System.out.println("name is: "+acc.getName());
								System.out.println("mobile no: "+acc.getMobNo());
								System.out.println("adhar no: "+acc.getAdharNo());
								System.out.println("gender: "+acc.getGender());
								System.out.println("Age: "+acc.getAge());
								System.out.println("Balance: "+acc.getBalance());
								System.out.println("*********************");
							}
							else
							{
								System.out.println("please first creat account");
				
							}
		
							}
								public void depositeMoney()
							{
							if(count!=0)
							{
								System.out.println("deposite money");
								double b=sc.nextDouble();
								double totaldeposite=acc.getBalance() +b;
			
								acc.setBalance(totaldeposite);
							}
							else
							{
								System.out.println("please first creat account");
							}
							}
		
								public void withdrawal()
								{   
			
		
			
									if (count!=0)
									{
										System.out.println("withdrawal amount");
										double c=sc.nextDouble();
										double updatebalance=acc.getBalance() -c;
			 
			
										while(true )
										{
											if(updatebalance>=1000)
											{
												acc.setBalance(updatebalance);
												break;
											}
											else
											{
				
												System.out.println("minimum balance should be 1000Rs");
												System.out.println("please enter withdrwal amount");
												updatebalance=acc.getBalance()-sc.nextDouble();
			
				
											}
										}
									}
									else
									{
										System.out.println(" please first creat acount");
									}
			
									}
								public void balanceCheck()
								{  
									if(count!=0)
									{
										System.out.println("the balance is"+acc.getBalance());
									}
									else
									{
										System.out.println("please first creat acount");
									}
								}
	
	

}
