package com.whileloop;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		int balance=0;
		int count=0;
		while(count!=4) {
			System.out.println("1.deposit:");
			System.out.println("2.withdraw");
			System.out.println("3.CheckBalance");
			System.out.println("4.Exit");
			count=b.nextInt();
			if(count==1) {
				System.out.println("1.deposit");
				int amount=b.nextInt();
				balance+=amount;
			}
			if(count==2) {
				System.out.println("Withdraw : Enter the amount");
			}
			if(count==3) {
				System.out.println("balance  =" +balance);
				
			}
			if(count==4) {
				System.out.println("Thank you");
			}
			
		}
    b.close();
	}

}
