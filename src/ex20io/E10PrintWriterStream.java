package ex20io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E10PrintWriterStream {

	public static void main(String[] args) throws IOException {
		
		//입력스트림 없이 출력스트림만 있는 클래스
		PrintWriter out = new PrintWriter(new FileWriter("src/ex20io/printf.txt"));
		
		//앞에서 txt파일을 통해 생성한 스트림을 통해 내용을 입력한다. 
		out.printf("저는 갓난애기라서 %d살입니다.", 0);
		out.println("");
		
		out.println("저는 우는 걸 좋아해영");
		out.print("울면 모든게 해결되앵");
		//스트림 소멸
		out.close();
		
		System.out.println("printf.txt가 생성되었습니다.");
	}

}
