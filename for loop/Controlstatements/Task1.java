package com.Controlstatements;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("                              Vaishnavi Restaurants");
		System.out.println("Items"+"              "+" Quantity"+"                "+"Price"+"                "+"Amount");
		System.out.println("-----------------------------------------------------------------------------------");
		int quantity=5;
		int price1=300;
		int quan=3;
		int price=500;
		int amount1=quantity*price1;
		int amount2=quan*price;
		int tb=amount1+amount2;
		System.out.println("Pasta"+"             "+"   5    "+"                 "+" 300"+"                 "+" "+amount1);
		System.out.println("Noodles"+"           "+"   5    "+"                 "+" 300"+"                 "+" "+amount2);
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Totalbill"+"                                                        "+tb);
		if(tb<=1000) {
			int t=(tb/100)*10;
			tb-=t;
			System.out.println("Discount"+"                                                     "+t);
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("Payable Amount"+"                                               "+tb);}
		if(tb>1000) {
			int t=(tb/100)*20;
			tb-=t;
			System.out.println("Discount"+"                                                       "+t);
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("Payable Amount"+"                                                "+tb);}
		System.out.println("---------------Thank You--------------- ");	
		System.out.println("--------------Visit Again---------------");
		
		}

	}

