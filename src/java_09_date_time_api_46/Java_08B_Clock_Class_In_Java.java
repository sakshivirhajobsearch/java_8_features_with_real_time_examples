package java_09_date_time_api_46;

//Java program for creating instance of Clock

import java.time.Clock;

public class Java_08B_Clock_Class_In_Java {

	// main method
	public static void main(String[] args) {

		// creating a Clock instance using
		// systemDefaultZone() method of Clock class
		Clock clock = Clock.systemDefaultZone();

		// it will print "SystemClock[Asia/Calcutta]" for me.
		// The output may be different because of server
		// system clock.
		System.out.println(clock);

		// printing zone of clock instance
		// it will print "Time zone : Asia/Calcutta" for me.
		System.out.println("Time Zone : " + clock.getZone());
	}
}
