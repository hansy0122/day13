package day13.LambdaExpression;
import java.util.function.*;

public class ArgumentMethodReferenceExample {
	public static void main(String ar[]){
		ToIntBiFunction<String, String> function;
		function=(a,b)->{return a.compareToIgnoreCase(b);}; //대소문자 구분안하고 같으면 0 빠르면 -1 늦으면 +1을 리턴하는 놈.
		System.out.println(function.applyAsInt("JJ", "jj")); 
		function=String::compareToIgnoreCase;
		System.out.println(function.applyAsInt("AA", "BB"));
		System.out.println(function.applyAsInt("BB", "AA"));
	}
}
