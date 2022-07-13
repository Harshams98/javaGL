package yt.lambda.expressions;


@FunctionalInterface
interface multi{
	int mul(int a,int b);
}

@FunctionalInterface
interface returnstrlen{
	int strr(String str);
}

//@FunctionalInterface Not Work The below is not functional interface 
interface Example{
	default int examples(String str) {
		return str.length();
	};
}

interface MyInterface {

    default boolean authorize(String value) {
        return true;
    }

    boolean equals(Object o);
}


public class lambdawithparameters {
	
	
	

	public static void main(String[] args) {

		multi multi=(int a,int b) -> {return a*b;};
		multi multis=(int a,int b) ->  a*b;//if you don't use {} then return is also not needed
		multi multt=(a, b) ->  a*b;//no need to mention int in paranthisis it will refer from interface 
		//if you don't use {} then return is also not needed
		System.out.println(multi.mul(4, 6));
		System.out.println(multis.mul(7, 9));

		returnstrlen obj=new returnstrlen(){

			@Override
			public int strr(String str) {
				// TODO Auto-generated method stub
				return str.length();
			}
			
		};
		System.out.println(obj.strr("Harsha"));
		
		
		//for default no need to override
		Example ex=new Example(){};
		//calling the interface function	
		System.out.println("Default Interface :"+ex.examples("qwerty"));
		
		
		
		returnstrlen object=(str) -> str.length();
		System.out.println(object.strr("Mahendarkar"));
		
		//imlimentation of lambda/signature
		//overriding the interface 
		Greetings objecct=() ->  "hello this is str";
		//calling the overridden function
		System.out.println(objecct.say());
		
		
		MyInterface myi= new MyInterface() {};
		System.out.println(myi.authorize("hello"));
		
	}

}
