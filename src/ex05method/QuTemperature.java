package ex05method;

import java.util.Scanner;

public class QuTemperature {

	public static void main(String[] args) {

		/*
		 문제5-3) 파일명 : QuTemperature.java  (난이도:중)
			섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 
			섭씨로 변환하여 리턴하는 함수를 만들어라.
		 */
		double result1 = calcCelsius();
		System.out.println("화씨(Fahrenheit): " + result1);
		double result2 = calcFahrenheit();
		System.out.println("섭씨(Celsius): " + result2);
		
	}
	
	public static double calcCelsius() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("섭씨(Celsius)를 입력하세요: ");
		double deg = input.nextDouble();
		double Fahrenheit = 1.8 * deg + 32;
		
		return Fahrenheit;
	}
	
	public static double calcFahrenheit() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("화씨(Fahrenheit)를 입력하세요: ");
		double deg = input.nextDouble();
		double Celsius = (deg - 32) / 1.8;
		
		return Celsius;
	}
	
}
