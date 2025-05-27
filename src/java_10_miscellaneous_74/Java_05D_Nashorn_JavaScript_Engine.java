package java_10_miscellaneous_74;

import java.io.FileReader;

//Program to illustrate calling of
//JavaScript function from Java code
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Java_05D_Nashorn_JavaScript_Engine {

	public static void main(String[] args) throws Exception {

		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
		ee.eval(new FileReader("geeks.js"));
		Invocable invocable = (Invocable) ee;

		// Here we are calling func1
		invocable.invokeFunction("func1");

		// Here we are calling func2
		// as well as passing argument
		invocable.invokeFunction("func2", "Bishal Kumar Dubey");
	}
}