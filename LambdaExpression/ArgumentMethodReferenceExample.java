package day13.LambdaExpression;
import java.util.function.*;

public class ArgumentMethodReferenceExample {
	public static void main(String ar[]){
		ToIntBiFunction<String, String> function;
		function=(a,b)->{return a.compareToIgnoreCase(b);}; //��ҹ��� ���о��ϰ� ������ 0 ������ -1 ������ +1�� �����ϴ� ��.
		System.out.println(function.applyAsInt("JJ", "jj")); 
		function=String::compareToIgnoreCase;
		System.out.println(function.applyAsInt("AA", "BB"));
		System.out.println(function.applyAsInt("BB", "AA"));
	}
}
