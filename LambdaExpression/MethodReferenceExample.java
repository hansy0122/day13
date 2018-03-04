package day13.LambdaExpression;

import java.util.function.*;

public class MethodReferenceExample {
	public static void main(String ar[]){
	
		IntBinaryOperator operator;
		operator=(a,b)-> Calculator.staticMethod(a, b);
		System.out.println(operator.applyAsInt(1, 2));
		operator= Calculator::staticMethod;
		System.out.println(operator.applyAsInt(3, 4));
		
		Calculator obj=new Calculator();
		operator=(a,b)->{return obj.instanceMethod(a, b);};
		System.out.println(operator.applyAsInt(1, 10));
		operator= obj::instanceMethod;
		System.out.println(operator.applyAsInt(1, 111));
	}
}

class Calculator{
	public static int staticMethod(int x,int y){
		return x+y;
	}
	
	public int instanceMethod(int x,int y){
		return x+y;
	}
}
