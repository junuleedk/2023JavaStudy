package ex12inheritance;

public class Animal {
	
	//멤버변수 : 특정한 연산이 없다면 대부분의 멤버변수는 String으로 정의한다. 
//	public String species;//동물의 종류
	private String species;//동물의 종류
	public int age;//나이
	public String gender;//성별
	
	//생성자 메서드 : 3개의 멤버변수를 초기화한다.  
	public Animal(String s, int a, String g) {
		this.species = s;
		this.age = a;
		this.gender = g;
	}
	//멤버메서드 : 현재 상태를 출력
	public void showAnimal() {
		System.out.println("동물의종류:" + this.species + " 나이:" + this.age + " 성별:" + this.gender );
	}
	/*
	 부모클래스의 멤버가 private인 경우 자식클래스에서 접근이
	 불가능하므로 반드시 getter/setter메소드를 통해 접근해야한다.
	 -getter : private멤버를 반환할 때 사용
	 -setter : 값을 설정할 때 사용
	 */
	public String getSpecies() {
		return species;
	}
	
}
