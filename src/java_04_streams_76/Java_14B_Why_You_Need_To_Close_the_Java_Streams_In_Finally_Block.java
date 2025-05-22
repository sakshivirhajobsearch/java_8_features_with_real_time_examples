package java_04_streams_76;

public class Java_14B_Why_You_Need_To_Close_the_Java_Streams_In_Finally_Block {
	
	public static void main(String[] args) {
		try {

			// open files
			System.out.println("Open files");

			// do some processing
			int a = 45;
			int b = 5;

			int div = a / b;
			System.out.println("After dividing a and b ans is " + div);
		}

		catch (ArithmeticException ae) {

			System.out.println("exception caught");

			// display exception details
			System.out.println(ae);
		}

		finally {

			System.out.println("Inside finally block");

			// close the files irrespective of any exception
			System.out.println("Close files");
		}
	}
}