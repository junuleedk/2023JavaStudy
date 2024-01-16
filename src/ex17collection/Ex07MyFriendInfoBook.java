package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Friend {
	String name;
	String phone;
	String addr;

	// 생성자 : 멤버변수 초기화. 변수 구분을 위해 this 사용함.
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}

	// 멤버변수 전체를 출력하기 위한 멤버메서드
	public void showAllData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("주소: " + addr);
	}

	public void showBasicInfo() {} // 주석테스트
}

//고등학교 친구의 정보를 저장하기 위한 자식 클래스
class HighFriend extends Friend {
	// 확장한 멤버변수 : 별명
	String nickname;

	// 생성자 : 부모의 생성자를 먼저 호출한 후 멤버변수를 초기화한다.
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}

	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명: " + nickname);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명:" + nickname);
		System.out.println("전번:" + phone);
	}
}

//대학교 친구 정보를 저장하기 위한 자식클래스
class UnivFriend extends Friend {
	// 확장한 멤버변수로 전공과목을 표현
	String major;

	// 생성자
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공: " + major);
	}

	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phone);
	}
}

//메인클래스
public class Ex07MyFriendInfoBook {
	public static void menuShow() {
		System.out.println("######## 메뉴를 입력하세요 ########");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}

	public static void main(String[] args) {
		// 사용자 입력을 위한 인스턴스 생성
		Scanner scan = new Scanner(System.in);
		/*컬렉션은 최초 생성시 크기를 지정하지 않는다. 
		  입력 혹은 삭제되는 인스턴스에 따라 크기가 자동으로 설정된다.*/
		FriendInfoHandler handler = new FriendInfoHandler();
		while (true) {
			// 1. 메뉴를 출력한다.
			menuShow();
			// 2. 사용자로부터 수행할 기능의 메뉴를 입력받는다.
			int choice = scan.nextInt();
			// 3. 선택한 번호에 따라 메서드를 호출한다.
			switch (choice) {
			case 1:
			case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				 handler.searchInfo();
				break;
			case 6:
				 handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			}//// switch 끝
		} //// while 끝
	}//// main 끝
}//// class 끝

/* 해당 프로그램에서 기능을 담당하는 클래스로 핸들러 혹은 매니저 클래스라고 부른다. */
class FriendInfoHandler {
	//멤버변수 : [기존]인스턴스배열 => [변경]List컬렉션
//	private Friend[] myFriends;
//	private int numOfFriends;
	/*
	 기존에는 카운트를 위한 별도의 변수가 필요했지만, 컬렉션은 자동인덱싱을
	 지원하므로 필요하지 않다. 즉, 컬렉션 인스턴스만 있으면 된다. 
	  Friend 인스턴스를 저장할 수 있는 list컬렉션을 생성한다 
	 */
	ArrayList<Friend> lists; 
	
	/*
	 멤버변수가 변경되었으므로 생성자에서도 아래와 같이 수정해야한다. 
	 컬렉션을 초기화한다. 카운트가 필요 없으므로 매개변수 int num도 삭제한다. 
	 */
	public FriendInfoHandler() {
//		myFriends = new Friend[num];
//		numOfFriends = 0;
		lists = new ArrayList<Friend>();
	}

	// 친구 연락처 정보 추가
	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름: ");
		iName = scan.nextLine();
		System.out.print("전화번호: ");
		iPhone = scan.nextLine();
		System.out.print("주소: ");
		iAddr = scan.nextLine();

		// 입력선택에 따라 고딩 혹은 대딩으로 분리하여 입력받는다.
		if (choice == 1) {
			// 고딩을 선택한 경우 별명을 추가로 입력받는다.
			System.out.print("별명: ");
			iNickname = scan.nextLine();
			// High 인스턴스 생성 후 참조변수에 저장한다.
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			/*
			 * 참조변수를 인스턴스 배열에 추가한다. 인덱스로 사용된 변수의 초기값이 0이므로 0번 인덱스에 추가된 뒤 1증가된다. 이를 위해 "후위증가"
			 * 하고 있다.
			 */
//			myFriends[numOfFriends++] = high;
			
			/*기존 인스턴스배열에서는 인덱스를 위한 카운트가 필요했지만 
			  컬렉션에서는 필요하지 않다. 자동인덱싱이 지원되므로 add()를 통해
			  추가하기만 하면된다. */
			lists.add(high);
			
		} else if (choice == 2) {
			// 대딩인 경우 전공을 추가입력 받는다.
			System.out.print("전공: ");
			iMajor = scan.nextLine();
			// 인스턴스 생성과 동시에 배열에 추가한다.
//			myFriends[numOfFriends++] = (new UnivFriend(iName, iPhone, iAddr, iMajor);
			lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	}//// end of addFriend

	// 저장된 연락처의 전체정보를 출력하기위한 메서드
	public void showAllData() {
//		for (int i = 0; i < numOfFriends; i++) {
//			myFriends[i].showAllData();
//		}
		
		//일반 for문은 통해 반복 출력
		for (int i = 0; i < lists.size(); i++) {
			lists.get(i).showAllData();
		}
		
		
		System.out.println("==전체정보가 출력되었습니다.==");
	}

	// 저장된 연락처의 간략정보(2가지)만 출력하기위한 메서드
	public void showSimpleData() {
		
//		for(int i = 0; i < numOfFriends; i++) {
//			myFriends[i].showBasicInfo();
//		}
			
		//확장 for문으로 반복 출력
		
		for(Friend fr : lists) {
			fr.showBasicInfo();
		}
			
		System.out.println("==간략정보가 출력되었습니다.==");
	}
	//연락처 정보 검색
//	public void searchInfo() {
//		//검색여부 확인 위한 변수
//		boolean isFind = false;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("검색할 이름을 입력하세요: ");
//		String searchName = scan.nextLine();
//		
//		//이터레이터를 통해 검색 기능 구현
//		Iterator<Friend> itr = lists.iterator();
//		
//		//List컬렉션 전체를 대상으로 반복
//		while(itr.hasNext()) {
//			Friend fr = itr.next();
//			//검색할 이름과 인스턴스에 저장된 이름이 같은지 확인
//			if(searchName.compareTo(fr.name) == 0) {
////			if(searchName.equals(fr.name)) {
//				//일치하면 정보를 출력한다.
//				fr.showAllData();
//				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
//			}
//		}
//		//초기값을 유지하고 있다면 정보는 없는 경우이다.
//		if(isFind == false)
//			System.out.println("***찾는 정보가 없습니다.***");
//	}
	
	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 입력하세요: ");
		String searchName = scan.nextLine();
		
		for (int i = 0; i < lists.size(); i++) {
			
			Friend fr = lists.get(i);
			if (searchName.compareTo(fr.name) == 0) {
				lists.get(i).showAllData();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
				isFind = true;
			}
			
//		for(Friend fr : lists) {
//			if(searchName.compareTo(fr.name) == 0) {
//				fr.showAllData();
//				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
//				isFind = true;
//			}
		}
		if (isFind == false)
			System.out.println("*** 찾는 정보가 없습니다. ***");
	}
 	/*
	 퀴즈1]검색 기능의 메서드 searchInfo()를 일반 for문을 통해 기능을 구현하시오.
	 퀴즈2]삭제 기능의 메서드 deleteInfo()를 이터레이터를 통해 기능을 구현하시오.
	*/
		
	public void deleteInfo() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		//이터레이터 인스턴스를 생성
		Iterator<Friend> itr = lists.iterator();
		
		while(itr.hasNext()) {
			Friend fr = itr.next();
			if(deleteName.compareTo(fr.name) == 0) {
				lists.remove(fr);
				break;
			}
			else if(deleteName.compareTo(fr.name) == -1) {
				System.out.println("==삭제된 데이터가 없습니다.==");
			}
			else {
				System.out.println("==데이터가 삭제되었습니다.==");
			}
		}

	}
	
	//연락처 정보 삭제
//	public void deleteInfo() {
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("삭제할 이름을 입력하세요: ");
//		String deleteName = scan.nextLine();
//		
//		//인덱스는 음수가 없으므로 초기값은 -1로 지정한다.
//		int deleteIndex = -1;
//		//확장 for문으로 전체반복
//		for(Friend fr : lists) {
//			if(deleteName.compareTo(fr.name) == 0) {
//				//정보가 일치하면 참조값을 통해 인스턴스 삭제
//				lists.remove(fr);
//				//삭제가 완료되면 1로 변경
//				deleteIndex = 1;
//				//반복문을 즉시 탈출한다.
//				break;
//			}
//		}
//		//삭제여부에 따라 메세지를 출력한다.
//		if(deleteIndex == -1) {
//			System.out.println("==삭제된 데이터가 없습니다.==");
//		}
//		else {
//			System.out.println("==데이터가 삭제되었습니다.==");
//		}
//		
//	}//// end of deleteInfo

}