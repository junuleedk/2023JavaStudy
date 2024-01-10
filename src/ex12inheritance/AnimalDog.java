package ex12inheritance;

public class AnimalDog extends Animal {
	//확장한 멤버변수
	public String dogKind;//강아지종류
	public String name;//이름
	
	/*부모클래스의 멤버변수를 public으로 선언하면 자식클래스에서 접근할 수 있으므로 아래와 같이
	  직접 변수명을 사용할 수 있다. */
//	void bark() {	
//			System.out.println("이름이 " + this.name + "인 " + "종(species)이 " + super.species + "인 강아지가 짖는다."  );
//	}
	
	
	
	
	//생성자 메소드
	public AnimalDog(String s, int a, String g, String dk, String n) {
		/*
		 자식 클래식에서는 반드시 부모클래스의 객체를 먼저 생성해야한다. 
		 여기서 사용된 super()는 부모클래스의 생성자 메서드를 호출하는 용도로 사용된다. 
		 */
		super(s, a, g);
		//자신의 멤버변수를 초기화한다.
		this.dogKind = dk;
		this.name = n;
	}
	
	/*
	 2단계 - private 변경시 설명
	 부모클래스의 species 멤버변수는 private으로 선언되어 자식에서는 접근이 불가능하므로, 
	 이때는 public으로 선언된 getter메서드를 통해 접근해야 한다.
	 */
	 void bark() {	
		System.out.println("이름이 " + this.name + "인 " + "종(species)이 " + super.getSpecies() + "인 강아지가 짖는다."  );
	}
	 void showDog() {
		 /*
		  여기서 사용된 super는 부모클래스의 객체를 가리키는 의미로 
		  부모클래스인 showAnimal()메소드를 호출한다.
		  */
		 super.showAnimal();
		System.out.println("강아지의 현재상태: " + this.dogKind + " " + this.name);
	}
}
