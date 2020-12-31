package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.RBI;
import com.braindata.bankmanagement.serviceImpl.HDFC;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {       
							      
								    
									
								
								public static void main(String[] args)
								{
									//Sbi bank=new Sbi();
									RBI bank=new HDFC();
								
									while(true)
									{		
									System.out.println("please select operation");
									System.out.println("1 for create account");
									System.out.println("2 for display all details");
									System.out.println("3 for deposite money");
									System.out.println("4 for withdrwal");
									System.out.println("5 for balance check");
									System.out.println("6 for exit");
									
									
							      
									Scanner sc=new Scanner(System.in);
						    
									int i=sc.nextInt();
									int s=i;
							switch(s)
							
						  {
							
							case 1:
								   bank.createAccount();
								   
								   break;
							     
							case 2:
								   bank.displayAllDetails();
								  
								   break;
								   
							case 3:
								   bank.depositeMoney();
								   
								   break;
								
							case 4:
								   bank.withdrawal();
								   
								   break;
							case 5:
								   bank.balanceCheck();
								  
								   break;
							case 6:
								   System.out.println("thank you");
								   System.exit(0);
							default:
								   System.out.println("invalid");
							}
					}
							}
}
