package ex12inheritance;
//상속관계가 있는 클래스 정의
class X {
	void yourFunc() {
		System.out.println("나는 yourFunc(부모쪽에 정의)입니다.");
	}
}
class Y extends X {
	void yourFunc() {
		System.out.println("나는 yourFunc(자식쪽에 정의)입니다.");
	}
}

public class Test1 {
	//오버로딩의 예 (서로 다른 함수다)
	static void myFunc() {
		X x1 = new X();
		Y y1 = new Y();
		X x2 = new Y();
		
		
		
		
		System.out.println("나는 myFunc()");
	}
	static void myFunc(int p) {
		System.out.println("나는 오버로딩된 myFunc()");
	}
	public static void main(String[] args) {
		myFunc();
		myFunc(99);
	}
}
