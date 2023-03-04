package getTimeStamp;

import java.util.Date;

public class TimeStampStudyWithotSpace {

	public static void main(String[] args) {
		getTimeStamp();// call method
		System.out.println(getTimeStamp1());
	}
//type1 for calling 
	public static void getTimeStamp() {
		Date date = new Date();
		String StringFormatDate = date.toString().replace(" ", "_").replace(":", "_");
		System.out.println(StringFormatDate);
	}
	//type 2 for calling
	public static String getTimeStamp1() {
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
	
	}

}
