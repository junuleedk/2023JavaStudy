package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 사용자정의 예외클래스
 1. Exception 클래스를 상속한다.
 2. 생성자에서 예외발생시 출력할 메세지를 super()를 통해 입력한다.
 3. 예외 발생지점에서 if문으로 감지한 후 예외객체를 생성 및 throw한다.
 4. catch절에서 예외객체를 잡아 처리한다. 
 */
class AgeErrorExcepion extends Exception {
	public AgeErrorExcepion() {
		super("나이 입력이 개잘못되었어요");
	}
}
public class Ex06DeveloperDefine {

	public static void main(String[] args) {

		System.out.print("나이를 입력하세요: ");
		try {
			/*아래 메서드에서 예외가 발생할 수 있다는 것을 알 수 있다. 
			 * 또한 함수 호출문장이므로 해당 함수내에서 예외를 처리하지 않고
			 * throws 하므로 호출한 main에서 예외처리를 한다.*/
			int age = readAge();
			System.out.println("당신의 나이는 " + age + " 입니다.");
		}
		catch(AgeErrorExcepion e) {
			System.out.println("[예외발생]" + e.getMessage());
		}
	}
	//"예외던지기(무시)"를 하여 호출한 지점으로 전달한다. 
	public static int readAge() throws AgeErrorExcepion {
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		/*
		 나이 입력시 문자를 잘못 입력하는 경우에 대해 예외처리를 하고 있다. 
		 이 부분은 Java에서 미리 정의 해 놓은 예외처리 클래스를 사용한다. 
		 */
		try {
			inputAge = sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
			/*
			 만약 첫번째 예외가 발생하면 즉시 프로그램이 종료된다.
			 필요하면 아래 문장은 주석으로 처리하면 된다. 
			 */
			System.exit(0);
		}
		if(inputAge < 0) {
			AgeErrorExcepion ex = new AgeErrorExcepion();
			throw ex;
		}
		return inputAge;
	}	
}
