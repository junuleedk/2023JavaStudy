package ex05method;

public class QuCircleCalculator {

	public static void main(String[] args) {

		
		/*
		문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
			원의 반지름을 인수(파라메타)로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 
			이를 호출하는 main 메소드를 정의하라.
		 */
		
		double diameter = 5.5;
		double result1 = circleRound(diameter);
		double result2 = circleArea(diameter);
		System.out.println("원의 둘레(5.5): " + result1);
		System.out.println("원의 넓이(5.5): " + result2);
	}
	
	public static double circleArea(double a) {
		
		double area = a * a * 3.14;
	
		return area;
	}
	public static double circleRound(double a) {
		
		double round = 2 * 3.14 * a;
		
		return round;
	}
}
