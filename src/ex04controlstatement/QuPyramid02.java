package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {
		/*
		 문제2) 다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.
		 */
		
		   int x = 1;
	        do {
	        	int y = 1;
	        	do {
	        		if(x + y <= 6) {
	        			System.out.print("* ");
	        		}
	        		y++;
	        	}
	        	while(y <= 5);
	            x++;
	            System.out.println();
	        } 
	        while (x <= 5);
	}

}
