package ex12inheritance;

/*
class Animal {
	public String species;
	int age;
	String gender;
	
	public Animal(String s, int a, String g) {
		species = s;
		age = a;
		gender = g;
	}
	public void showAnimal() {
		System.out.println("동물의종류:" + species + " 나이:" + age + " 성별:" + gender );
	}
}
*/
/*
class AnimalDog extends Animal {
	String dogKind;
	String name;
	
	public AnimalDog(String s, int a, String g, String dk, String n) {
		super(s, a, g);
		dogKind = dk;
		name = n;
	}
	public void bark() {	
		System.out.println("이름이 " + name + "인 " + "종(species)이 " +species + "인 강아지가 짖는다."  );
	}
	public void showDog() {
		System.out.println("강아지의 현재상태: " + dogKind + " " + name);
	}
}
*/
public class AnimalMain {

	public static void main(String[] args) {
		//강아지 객체생성
		AnimalDog dog = new AnimalDog("포유류",2,"수컷","포매라니안","뽀미");
		
		dog.showAnimal();
		System.out.println("==========================");
		dog.bark();
		System.out.println("==========================");
		dog.showDog();
	}
}
