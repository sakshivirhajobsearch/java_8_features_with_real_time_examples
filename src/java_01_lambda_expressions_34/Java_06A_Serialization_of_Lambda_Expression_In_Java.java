package java_01_lambda_expressions_34;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Custom functional interface that is both Serializable and a Function
@FunctionalInterface
interface SerializableFunction<T, R> extends java.util.function.Function<T, R>, Serializable {
}

//Functional Interface
//Functional Interface
interface MyInterfaceA extends Serializable {
	void hello(String name);
}

//Class implementing MyInterfaceA
class MyImplA implements MyInterfaceA, Serializable {
	private static final long serialVersionUID = 1L;

	public void hello(String name) {
		System.out.println("Hello " + name);
	}
}

public class Java_06A_Serialization_of_Lambda_Expression_In_Java {

	// Serialize object to file
	private static void serialize(Serializable obj, String outputPath) throws IOException {
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(outputPath))) {
			outputStream.writeObject(obj);
		}
	}

	// Deserialize object from file
	private static Object deserialize(String inputPath) throws IOException, ClassNotFoundException {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(inputPath))) {
			return inputStream.readObject();
		}
	}

	// Serialize and deserialize a lambda function
	private static void serializeAndDeserializeFunction() throws Exception {
		SerializableFunction<Integer, String> fn = (Integer n) -> "Hello " + n;
		System.out.println("Run original function: " + fn.apply(10));

		String path = "./serialized-fn";
		serialize(fn, path);
		System.out.println("Serialized function to " + path);

		SerializableFunction<Integer, String> deserializedFn = (SerializableFunction<Integer, String>) deserialize(
				path);
		System.out.println("Deserialized function from " + path);
		System.out.println("Run deserialized function: " + deserializedFn.apply(11));
	}

	// Serialize and deserialize a class instance (not Class<?> object)
	private static void serializeAndDeserializeClass() throws Exception {
		String path = "./serialized-class";
		MyInterfaceA obj = new MyImplA();
		serialize(obj, path);
		System.out.println("Serialized class instance to " + path);

		MyInterfaceA deserializedObj = (MyInterfaceA) deserialize(path);
		System.out.println("Deserialized class instance from " + path);
		deserializedObj.hello("Java");
	}

	// Main method
	public static void main(String[] args) throws Exception {
		serializeAndDeserializeFunction();
		serializeAndDeserializeClass();
	}
}
