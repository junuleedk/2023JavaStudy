package test;

import java.io.IOException;

public class Test1 {
	
	static void myFunc() throws IOException {
		int a = System.in.read();
	}

	public static void main(String[] args) {
		
		try {
			myFunc();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
