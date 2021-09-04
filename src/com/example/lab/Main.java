package com.example.lab;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name;
		System.out.print("What your name? > ");
		name = s.next();
		
		System.out.print("Your name is "+name+".");
		
		System.out.print("Hello");
	}
}
