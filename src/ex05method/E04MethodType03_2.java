package ex05method;

import java.util.Scanner;

public class E04MethodType03_2 {
	/*
	연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아 이에 해당하는 구구단을 출력하는 메서드를 작성하시오. 무조건 첫번째 입력받는수가 작아야한다.
	입력예]
		첫번째숫자 : 3
		두번째숫자 : 12
		3*1=3 3*2=6........
		........
		...................12*9=108
	메서드명 : inputGugudan(int sNum, int eNum)
	 */
	//while문으로 작성한 메서드
	static void inputGugudan1(int sNum, int eNum) {
		int dan = sNum;
		//단에 대한 조건(2 ~ 9단까지)
		while(dan <= eNum) {
			//수를 표현한 변수
			int su = 1;
			//수에 대한 조건(1 ~ 9 까지 단이 고정된 상태에서 증가)
			while(su <= 9) {
				//서식문자를 통해 구구단을 출력한다.
				System.out.printf("%-2d *  %-2d = %2d", dan, su, (dan * su));
				System.out.print("   ");
				//수를 1 증가시킴
				su++;
			}
			System.out.println();
			dan++;
		}
	}
	
	//for문으로 작성한 메서드
	static void inputGugudan2(int sNum, int eNum) {
		//sNum단에서 eNum단 까지를 출력하는 프로그램.
		for(int dan = sNum; dan <= eNum; dan++) {
			for(int su = 1; su <= 9; su++) {
				System.out.printf("%-2d *  %-2d = %2d", dan, su, (dan * su));
				System.out.print("   ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 숫자: ");
		int s = input.nextInt();
		System.out.println("첫번째 숫자: ");
		int e = input.nextInt();
		if (s < e) {
			inputGugudan1(s, e);
		}
		else {
			System.out.println("다시 입력하세요");
		}
//		inputGugudan2(2, 3);
	}
}
