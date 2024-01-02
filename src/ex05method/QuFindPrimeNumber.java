package ex05method;

public class QuFindPrimeNumber {

	public static void main(String[] args) {

		/*
		 * 문제5-4) 파일명 : QuFindPrimeNumber.java (난이도:상) 전달된 값이 소수인지 아닌지를 판단하여 소수인 경우
		 * true를 아니면 false를 반환하는 메소드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를
		 * 정의하자. 소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.
		 */
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
	}

	public static boolean isPrime(int num) {
			if (num == 1) {
				return false;
			}
			for (int i = 2; i < num; i++) {
				if(num % i == 0) {
					return false;
				}
			}
			return true;
	}
}
