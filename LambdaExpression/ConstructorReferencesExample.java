package day13.LambdaExpression;
import java.util.function.*;
public class ConstructorReferencesExample {
	public static void main(String ar[]){
		Function<String,ConstructorRe> function;
		function=ConstructorRe::new;
		function.apply("AA");
		function=(id)->{return new ConstructorRe(id);};
		function.apply("BB");
		BiFunction<String,String,ConstructorRe> biFunction;
		biFunction=ConstructorRe::new;
		biFunction.apply("CC", "DD");
	}
}

class ConstructorRe{
	private String id;
	private String name;
	
	public ConstructorRe(String id){
		this.id=id;
		System.out.println("ConstructorRe(id) 실행"+this.id);
	
	}
	public ConstructorRe(String id,String name){
		this.id=id;
		this.name=name;
		System.out.println("ConstructorRe(id,name)실행"+this.id+this.name);
		
	}
}