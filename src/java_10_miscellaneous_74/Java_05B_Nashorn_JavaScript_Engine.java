package java_10_miscellaneous_74;

//Program to illustrate embedding
//of JavaScript code into Java code
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Java_05B_Nashorn_JavaScript_Engine {

	public static void main(String[] args) throws Exception {

		// Here we are generating Nashorn JavaScript Engine
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");

		// Instead of reading JavaScript code from a file.
		// We can directly paste the JavaScript
		// code inside Java Code
		ee.eval("print('Welcome to Geeksforgeeks!!!" + " Executing JavaScript code with the"
				+ " help of Nashorn engine');");
	}
}
