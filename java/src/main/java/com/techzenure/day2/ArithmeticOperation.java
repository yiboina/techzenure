package com.techzenure.day2;

public class ArithmeticOperation {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 12;
		int add = a + b;
		int sub = a - b;
		long multi =a * b;
		double div = b/a;
		int increOpe = ++a;
		System.out.println(a);
		System.out.println("inc : "+ increOpe);
		int decreOpe = b--;
		System.out.println(b);
		System.out.println("de : "+ decreOpe);

	}

}