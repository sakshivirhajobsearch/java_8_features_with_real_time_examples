package java_10_miscellaneous_74;

import java.io.FileReader;

//Program to illustrate embedding
//of JavaScript file into Java code
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Java_05A_Nashorn_JavaScript_Engine {

	public static void main(String[] args) throws Exception {

		// Here we are generating Nashorn JavaScript Engine
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");

		// Reading JavaScript file create in first approach
		ee.eval(new FileReader("geeks.js"));
	}
}
