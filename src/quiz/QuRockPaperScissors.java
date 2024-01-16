package quiz;

import java.util.Random;
import java.util.Scanner;


public class QuRockPaperScissors {

	public static void main(String[] args) {
		/*
		 * 게임설명 : 가위바위보 게임을 메소드를 통해 구현한다. 난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다. 사용자가
		 * 가위(1),바위(2),보(3) 중 하나를 낸다. 승부를 판단하여 출력한다. 1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고
		 * 재입력을 요구한다. 숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다. 게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다.
		 * 재시작(1), 종료(0) 0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.
		 */
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
		
		int userRanNum = input.nextInt();
		int comRanNum = random.nextInt(2) + 1;
		
		if(userRanNum == 1) {
			System.out.print("사용자: 가위  " );
			if(comRanNum == 1) {
				System.out.println();
			}
		}
		else if(userRanNum == 2) {
			System.out.print("사용자: 바위  " );
		}
		else if(userRanNum == 3) {
			System.out.print("사용자: 보  " );
		}
	}

}
