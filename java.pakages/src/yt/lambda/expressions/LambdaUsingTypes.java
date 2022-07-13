package yt.lambda.expressions;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaUsingTypes {

	public static void main(String[] args) {
		
		Function<Double,Double> val=i->i/i;
		System.out.println(val.apply(6.0));
		System.out.println(val.apply(6.77) );
		
		Function<Integer,Integer> odd=i->i%2;
		//String value=odd.apply(6) ==1?"odd":"even";
		System.out.println(odd.apply(7)==1?"odd":"even");
	
		//System.out.println(odd.apply(7));

		
		//better  implementation 
		Predicate <Integer> oddeve=i->i%2==0;
		System.out.println(oddeve.test(2)?"even":"odd");
	}

}
