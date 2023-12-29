package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {

		/*
		 문제4) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while문으로 작성하시오. 
		 단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의 결과는 누적되는 모든 수를 콘솔에 print한다.
		 */
		
		 int num = 1;
	        int total = 0;

	        while (num <= 100) {
	            if (num % 3 == 0 || num % 7 == 0) {
	                total += num;
	                if (num % 3 == 0 && num % 7 == 0) {
	                    total -= num; 
	                }
	                System.out.println(num);
	            }
	            num++;
	        }

	        System.out.println("1-100 사이 3과 7의 배수 합(공배수는 제외): " + total);
		
	}

}
