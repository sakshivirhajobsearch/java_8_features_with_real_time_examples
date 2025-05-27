package java_10_miscellaneous_74;

import java.io.FileReader;

//Program to illustrate passing of variable
//from java code to javascript file
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Java_05C_Nashorn_JavaScript_Engine {

	public static void main(String[] args) throws Exception {

		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
		Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
		bind.put("name", "Bishal Kumar Dubey");
		ee.eval(new FileReader("geeks1.js"));
	}
}
