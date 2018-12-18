import org.junit.Before;
import org.junit.Test;
public class TestCaseOfDate {

	DateAndTime dateAndTime1 = new DateAndTime();
	DateAndTime dateAndTime2 = new DateAndTime();
	DateAndTime dateAndTime3 = new DateAndTime();
	@Before
	public void setput(){
		dateAndTime1.setHours1AndMinutes1(10,20);
		dateAndTime2.setHours1AndMinutes1(4, 40);
		dateAndTime1.showTime();
		dateAndTime2.showTime();
	}
	@Test
	public void test() {
		int hour = dateAndTime1.hours + dateAndTime2.hours;
		int minute = dateAndTime2.minutes + dateAndTime2.minutes;
		while(minute >= 60)
		{
			minute -= 60;
			++hour;
		}
		dateAndTime3.setHours1AndMinutes1(hour, minute);
		dateAndTime3.showTime();
	}

}
