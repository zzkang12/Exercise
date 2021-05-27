package study.ex;

import java.util.Calendar;
import java.util.Date;

/*
 * 	오늘의 날짜를 입력 받아서
 * 	그 날짜에 해당하는 배열의 공간을 생성
 * 	생성한 공간에 운동을 했는지 안했는지를 확인하는 boolean 값을 넣어준다.
 * 
 */
public class Calendar1 {

	public String today() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH)+1;
		int date = cal.get(cal.DATE);
		return year+" "+month+" "+date;
	}
}
