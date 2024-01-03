package ex06array;

public class QuArray1To10 {

	public static void main(String[] args) {

		/*
		 * 다음 절차에 따라 프로그램을 작성하시오. 
		 * 1. 크기가 10인 정수타입의 배열을 선언한다. 
		 * 2. 반복문을 이용하여 배열을 채운다. 이때
		      배열은 1,2,3,4....순서대로 채운다. 
		 * 3. 2번에서 채운 배열을 출력한다. 
		 * 4. 위에서 채운 배열의 첫번째 값에서 마지막값까지
		      누적해서 더한다. 
		 * 5. 누적해서 더한 값을 출력한다.
		 */
		
		System.out.println("초기화된 배열 요소");
		
		int[] numArr = new int[10];
		int sum = 0;
		for(int i = 1; i <= numArr.length; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.println();
		System.out.println("배열전체요소의 합: " + sum);
	}
	
}
