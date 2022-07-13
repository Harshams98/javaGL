package exceptionhandling;

import java.io.IOException;

public class ThrowThrows {
	
	static void checkstring(String name) throws IOException {//throws
		
		if(name!="harsha")
			throw new IOException("The name is mismatch IO Exception Caught ");
	}

	public static void main(String[] args) throws IOException 
	//^ if you dont use try block to call custom exp have to use throws
	//both the time
	{
		// throws keyword is needed		
			checkstring("Harshea");

	}

}
