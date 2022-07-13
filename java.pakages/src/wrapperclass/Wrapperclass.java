package wrapperclass;

public class Wrapperclass {
	//primitive to wrapper classes
	public static void main(String[] args) {
		
		int num=10;
		float deci=17.573f;
		byte b=2;
		long l=8869;
		double d=77.897;
		char c='A';
		short s=7;
		boolean bool=true;
		
		//converting into -- wrapper objects
		Integer obj=(Integer)num;
		
		Float obje=Float.valueOf(deci);
		
		Byte objec=(Byte)b;
		
		Long object=Long.valueOf(l);
		
		Double objectt=Double.valueOf(d);
		
		Character objectc=Character.valueOf(c);
		
		Short objects=Short.valueOf(s);
		
		Boolean objectbool=Boolean.valueOf(bool);
		
		//checking if objects are instance of wrapper classes
		if(obj instanceof Integer) {
			System.out.println("An object of Integer = "+obj);
		}
		
		if(obje instanceof Float) {
			System.out.println("An object of Float = "+obje);
		}
		
		if(objec instanceof Byte) {
			System.out.println("An object of Byte = "+objec);
		}
		
		if(object instanceof Long) {
			System.out.println("An object of Long = "+object);
		}
		
		if(objectt instanceof Double) {
			System.out.println("An object of Double = "+objectt);
		}
		
		if(objectc instanceof Character) {
			System.out.println("An object of Character = "+objectc);
		}
		
		if(objects instanceof Short) {
			System.out.println("An object of Short = "+objects);
		}
		
		if(objectbool instanceof Boolean) {
			System.out.println("An object of Boolean = "+objectbool);
		}
		
		//Better implementation

		Integer digit=10;

		Double doubledigit=45.678; Character letter='K';

		Float decimal=3.142f;
		System.out.println("----------------");
		System.out.println("Interger wrapper object created "+ digit);

		System.out.println("Double wrapper object created" + doubledigit);

		System.out.println("Charecter wrapper object created "+ letter);
		System.out.println("FLoat wrapper object created "+ decimal);

		System.out.println("----------------");

		System.out.println(digit.intValue());

		System.out.println(doubledigit.doubleValue());

		System.out.println(letter.charValue());

		System.out.println(decimal.floatValue());

	}

}
