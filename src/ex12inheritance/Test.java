package ex12inheritance;

public class Test {
	//보통의 경우 멤버변수의 접근지정자는 private으로 선언한다. 
	private int age;
	private String name;
	private boolean isMarried;
	
	//소스 - 제너레이트 컨스트럭트 유징 필드
	//생성자(디폴트 생성자 및 인수생성자)
	public Test() {}
	public Test(int age, String name) {
//		super();//부모의 생성자를 불러오는건데 이게 생기는 이유는 나중에
		this.age = age;
		this.name = name;
	}
	public Test(int age, String name, boolean isMarried) {
//		super();//부모의 생성자를 불러오는건데 이게 생기는 이유는 나중에
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
	}
	//getters / setters 메서드 : private 멤버변수를 외부 클래스에 접근하여 값을 반환하거나 설정하는 메서드.
	//외부에서 접근 가능해야하므로 반드시 public으로 선언해야한다. 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
	
}
