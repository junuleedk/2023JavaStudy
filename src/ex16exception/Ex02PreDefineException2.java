package ex16exception;

import java.util.Scanner;

public class Ex02PreDefineException2 {
	 
	public static void main(String[] args)  {	
 
		System.out.println("### NumberFormatException ###");
		Scanner sc = new Scanner(System.in);
		try {
			/*나이 입려기 "10살" 과 같이 입력하면 연산을 위해 정수로 변환하는 과정에서
			  예외가 발생하게 된다. 즉 숫자형식이 아닌 경우 변환을 시도했을때 발생하는 예외*/
			System.out.print("나이를 입력하세요:");
			String strAge = sc.nextLine(); 
			int ageAfter10 = Integer.parseInt(strAge) +  10;
			System.out.println("당신의 10년후 나이는:"+ ageAfter10);
		}
		catch(NumberFormatException e) {
//			System.out.println("나이를 숫자형태로 입력해야 합니다.");
//			System.out.println("예외메세지:"+e.getMessage());
			e.printStackTrace();
		} 
	}////end of main 
}

