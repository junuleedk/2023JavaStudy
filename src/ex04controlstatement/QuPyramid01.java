package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {
			/*
			 문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
			 */
		 int x = 1;

	        while (x <= 5) {
	            int y = 1;
	            
	            while (y <= 5) {
	                if (x >= y) {
	                    System.out.print("* ");
	                }
	                y++;
	            }

	            x++;
	            System.out.println();
	        }
	}

}
