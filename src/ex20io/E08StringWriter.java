package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class E08StringWriter {

	public static void main(String[] args) {

		try {
			/*
			 문자열을 저장하기 위한 출력스트림을 생성한다. 
			 문자열의 입력은 버퍼에 따라 성능의 차이가 크기 때문에 버퍼 필터 스트림을 
			 추가로 연결해서 사용한다.
			 */
			BufferedWriter out = new BufferedWriter(new FileWriter("src/ex20io/string.txt"));
			
			/*
			 write()를 통해 문자열을 저장하고, 줄바꿈은 newLine()을 통해 처리한다. 
			 각 OS별로 개행문자가 다르기 때문에 매서드를 이용해야한다. 
			 */
			out.write("늘 배가 고프다. ");
			out.newLine();
			out.write("배가 고픈데 많이 먹으면 살이찌겠지?");
			//스트림 종료
			out.newLine();
			
			out.close();
			System.out.println("입력완료");
		}
		catch(FileNotFoundException e) {
			System.out.println("파일없음");
		}
		catch(IOException e) {
			System.out.println("IO오류");
		}
	}
}
