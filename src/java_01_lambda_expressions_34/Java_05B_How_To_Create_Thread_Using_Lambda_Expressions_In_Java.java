package java_01_lambda_expressions_34;

public class Java_05B_How_To_Create_Thread_Using_Lambda_Expressions_In_Java {

	public static void main(String[] args) {
		
		Runnable basic = () -> {

			String threadName = Thread.currentThread().getName();
			System.out.println("Running common task by " + threadName);
		};

		// Instantiating two thread classes
		Thread thread1 = new Thread(basic);
		Thread thread2 = new Thread(basic);

		// Running two threads for the same task
		thread1.start();
		thread2.start();
	}
}