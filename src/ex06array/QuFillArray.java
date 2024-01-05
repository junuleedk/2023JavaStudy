package ex06array;

import java.util.Scanner;

public class QuFillArray {

	public static void main(String[] args) {

		/*
		 * 문제3) 홀수/짝수 구분하여 배열채우기 파일명 : QuFillArray.java 길이가 10인 배열을 선언한 후 총 10개의 정수를
		 * 입력받아 순서대로 저장한다. (첫번째배열) 그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터
		 * 채워나간다.(두번째배열)
		 */

		int[] numArr1 = new int[10];
		
		
		for (int i = 0; i < 10; i++) {
			Scanner input = new Scanner(System.in);
			System.out.print((i + 1) + "번째 정수를 입력하세요: ");
			int num = input.nextInt();
			numArr1[i] = num;
		}

		numList1(numArr1);
		numList2(numArr1);
	}

	static void numList1(int[] numArr1) {
		System.out.println("순서대로 입력된 결과");
		for (int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr1[i] + " ");
		}
		System.out.println();
	}

	static void numList2(int[] numArr1) {
		System.out.println("홀수/짝수 구분 입력 결과");
		int odd = 0, even = 9;
		int[] numArr2 = new int[10];
		
		for (int i = 0; i < numArr2.length; i++) {
			int num = numArr2[i];

			if (num % 2 == 0) {
				numArr2[even--] = num;
			} else {
				numArr2[odd++] = num;
			}
			System.out.print(numArr2[i] + " ");
		}

	}

}
