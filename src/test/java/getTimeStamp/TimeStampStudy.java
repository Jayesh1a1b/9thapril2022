package getTimeStamp;

import java.util.Date;

public class TimeStampStudy {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		String getTimeStamp1 = date.toString().replace(" ", "_");// convert space into _
		String getTimeStamp = getTimeStamp1.replace(":", "_");//convert : into _ and make single string
		System.out.println(getTimeStamp);
	}

}
