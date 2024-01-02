package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {

		/*
		 문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
		두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
		인수(파라메타)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.
		메소드명 : arithmetic()
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num1 = input.nextInt();
		System.out.println("정수를 입력하세요");
		int num2 = input.nextInt();
		arithmetic(num1, num2);
	}
	
	public static void arithmetic(int a, int b) {
		int add	 = a + b;
		int substration = a - b;
		int multi = a * b;
		int divShare = a / b;
		int divRemainder = a % b;
		System.out.println("덧셈결과: " + add);
		System.out.println("뺄셈결과: " + substration);
		System.out.println("곱셈결과: " + multi);
		System.out.println("나눗셈 몫: " + divShare);
		System.out.println("나눗셈 나머지: " + divRemainder);
	}
}
