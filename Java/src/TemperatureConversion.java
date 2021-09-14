/*
 * Ares Ton-That
 * This program is designed to convert temperature in Celsius to
 * temperature in Fahrenheit and vice-versa.
 */

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a temperature in Celsius.
		System.out.print("Enter a temperature in Celsius: ");
		int degreesCelsius = input.nextInt();
		//Create Celsius to Fahrenheit Conversion Formula.
		double celsiusToFahrenheit = (9.0/5.0) * degreesCelsius + 32;
		//Convert Celsius to Fahrenheit and display the result.
		System.out.println(degreesCelsius + " Celsius is " + 
		                   celsiusToFahrenheit + " Fahrenheit");
		//Prompt the user to enter a temperature in Fahrenheit.
		System.out.print("Enter a temperature in Fahrenheit: ");
		int degreesFahrenheit = input.nextInt();
		//Create Fahrenheit to Celsius Conversion Formula.
		double fahrenheitToCelsius = (degreesFahrenheit -32) * (5.0/9.0);
		//Convert Fahrenheit to Celsius and display the result.
		System.out.println(degreesFahrenheit + " Fahrenheit is " + 
                fahrenheitToCelsius + " Celsius");
		input.close();

	}

}