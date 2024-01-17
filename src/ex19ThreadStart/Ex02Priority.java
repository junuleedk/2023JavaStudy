package ex19ThreadStart;

class MessageSendingThread extends Thread {
	String message;
	public MessageSendingThread(String str) {
		/*
		 우선순위 지정이 없는 경우에는 일괄적으로 5를 부여받는다. 
		 */
		message = str;
	}
	public MessageSendingThread(String str, int pri) {
		message = str;
		setPriority(pri);
	}
	public void run() {
		for(int i =1; i <=1000; i++) {
			System.out.println(message + i + "("+ getPriority() +")");
			try {
				sleep(1);
			}
			catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
public class Ex02Priority {

	public static void main(String[] args) {

//		MessageSendingThread tr1 = new MessageSendingThread("첫번째");
//		MessageSendingThread tr2 = new MessageSendingThread("두번째");
//		MessageSendingThread tr3 = new MessageSendingThread("세번째");
		
		/*
		 2단계 실행
		 : 오버로딩하여 정의한 생성자를 통해 우선순위를 부여한 상태로 인스턴스를 생성한다. 
		   Thread클래스의 정적상수를 통해 10, 5, 1의 우선순위를 부여할 수 있다. 
		   상수 대신 정수로 부여해도 된다. 1 ~ 10까지.
		 */
		MessageSendingThread tr1 = new MessageSendingThread("첫번째", Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("두번째", Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("세번째", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}

}
