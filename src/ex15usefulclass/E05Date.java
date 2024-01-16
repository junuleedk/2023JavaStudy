package ex15usefulclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05Date {
	/*
	 Calendar 클래스를 통해 얻은 인스턴스를 초로 반환한 후 매개변수로 전달된
	 날짜서식으로 변경한 문자열을 반환한다.  
	 */
	public static String myDateFormat(Calendar c, String formatStr) {
		/*
		 getTime()	: 서버의 표준시인 1970-01-01부터 현재까지의 시간을 초 단위로 반환해준다.
		 			  이름 타임스탬프라고한다. 
		*/
		Date date = c.getTime();
		return new SimpleDateFormat(formatStr).format(date);
	}
	public static void main(String[] args) {
		/*
		 Calendar 클래스는 대표적인 싱글톤 클래스이므로 new로 인스턴스를 생성할 수 없고, 유틸리티 메서드를 통해 참조값을 얻어온다. 
		 */
		Calendar calendar = Calendar.getInstance();
		/*
		 월을 표현하는 Month, 분을 표현하는 Minute의 이니셜이 동일하므로 구분을 워해 월은 대문자, 분은 소문자를 사용한다.
		 */
		String nowStr1 = myDateFormat(calendar, "yyyy-MM-dd HH:mm:ss");
		System.out.println("현재1: " + nowStr1);
		//그 외 여러가지 서식문자가 존재한다.
		String nowStr2 = myDateFormat(calendar, "오늘은 M월의 W번째주, d번째날, F번째 E요일");
		System.out.println("현재2: " + nowStr2);
		/*
		 현재 날짜는 기준으로 전/후를 구하기 위해 add()를 사용한다.
		 음수를 인수로 주면 과거의 날짜를 구할 수 있다. 
		 */
		calendar.add(Calendar.DATE, 3);//3일후
		calendar.add(Calendar.MONTH, 2);//2개월후
		calendar.add(Calendar.YEAR, 1);//내년(1년후)
		String nowStr3 = myDateFormat(calendar, "yyyy년 MM월 dd일");
		System.out.println("1년 2개월3일후: " + nowStr3);
		//앞에서 add를 3번 호출했으므로 연산한 결과는 아래와 같다. 
		
		/*
		 올해 크리스마스까지 남은 날짜를 계산한다. 여기서는 두가지 서식의 날짜를 파싱하여
		 구한 날짜 객체를 통해 계산한다.
		 */
		
		//오늘날짜 : 0000-00-00 형식
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		//크리스마스 : 0000/00/00 형식
		String future = "2024/12/25";
//		System.out.println(today + " " + future);
		long result = myDiffDate(today, future);
		System.out.println(today + "에서 " + future + "까지 남은날짜: " + result);
	}
	
	public static long myDiffDate(String today, String future) {
		long diffDays = 0;
		try {
			/*
			 매개변수를 통해 전달된 2개의 문자열은 날짜의 서식이 서로 다르다
			 따라서 각 날짜의 서식을 명확히 지정해야먄 날짜를 인식하여 연산을 할 수 있다.
			 아래에서 String을 Date로 변환하고 있다. 
			 */
	
			Date formatToday = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			Date formatFuture = new SimpleDateFormat("yyyy/MM/dd").parse(future);
			System.out.println(formatToday + " <> " + formatFuture);
			/*
			 getTime()으로 얻어오는 시간은 13자리의 정수값인데 10자리는 순순한 초(sec)이고, 11~13자리는
			 밀리세컨즈를 의미한다. 즉, 100으로 나눠서 뒤의 3자리를 제거하면 순수한 초가 반환된다.
			 또한 하루는 60*60*24로 86400초 이므로 아래와 같이 남은 날짜를 계산할 수 있다. 
			 */
			diffDays = (formatFuture.getTime() - formatToday.getTime()) / (24 * 60 * 60 * 1000);
		}
		catch (Exception e) {}
		return diffDays;
	}

}