package java_02_functional_interfaces_28;

//Java program to demonstrate functional interface
//before Java 8
class Java_01C_Functional_Interfaces_Approach_3 {
	
	public static void main(String args[]) {

		// create anonymous inner class object
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("New thread created");
			}
		}).start();
	}
}