package com.techzenure.day2;


import java.util.Scanner;

public class billgenerations {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the no of pizzas bought : ");
		int noofpizzas = scr.nextInt();
		System.out.println("enter the no of puffs bought : ");
		int noofpuffs = scr.nextInt();
		System.out.println("enter the no of cool drinks bought : ");
		int noofdrinks = scr.nextInt();
		int pizzacost = 100;
		int puffcost = 20;
		int coolDrink = 10;
		int totalpizzacost = pizzacost*noofpizzas;
		int totalpuffcost = puffcost*noofpuffs;
		int totalDrinkscost = coolDrink*noofdrinks;
		double total = totalpizzacost+totalpuffcost+totalDrinkscost;
		System.out.println("No of Pizzas : "+ noofpizzas+"  cost : "+totalpizzacost);
		System.out.println("No of Puffs : "+ noofpuffs+"  cost : "+totalpuffcost);
		System.out.println("No of Cool Drinks : "+ noofdrinks +"  cost : "+ totalDrinkscost);
		
		System.out.println("Total Cost + " +total);
		System.out.println("ENJOY THE SHOW!!!");
		
		
		

	}

}
