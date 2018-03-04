package day13.LambdaExpression;
import java.util.function.*;
public class PredicateIsEqualExample {
	public static void main(String ar[]){
		
		Predicate<String> predicate;
		
		predicate=Predicate.isEqual(null);
		System.out.println("null,null: "+predicate.test(null));
		
		predicate=Predicate.isEqual("java");
		System.out.println("java,null: "+predicate.test(null));
		
		predicate=Predicate.isEqual(null);
		System.out.println("null,java: "+predicate.test("java"));
		
		predicate=Predicate.isEqual("java");
		System.out.println("java,java: "+predicate.test("java"));
		
		predicate=Predicate.isEqual("java");
		System.out.println("java,pizza: "+predicate.test("pizza"));
	}
}
