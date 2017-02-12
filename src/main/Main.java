package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double weight;
		double height;
		double bmi;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Input weight in kilograms: ");
		weight = sc.nextDouble();

		System.out.print("Input height in meters (eg. 1,76): ");
		height = sc.nextDouble();

		bmi = weight / (height * height);

		System.out.print("Your BMI is equal to: " + bmi);
						
	}

}
