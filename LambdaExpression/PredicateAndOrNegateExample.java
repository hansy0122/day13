package day13.LambdaExpression;
 import java.util.function.*;
public class PredicateAndOrNegateExample {
	public static void main(String ar[]){
		

		IntPredicate predicateA=(a)->{return (a%2==0);};
		IntPredicate predicateB=(b)->{return (b%3==0);};
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB=predicateA.and(predicateB);
		result =predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����ΰ�? "+ result);
		//or()
		predicateAB=predicateA.or(predicateB);
		result =predicateAB.test(9);
		System.out.println("9�� 2�Ǵ� 3�� ����ΰ�? "+ result);
		//negate()
		predicateAB=predicateA.negate();
		result =predicateAB.test(9);
		System.out.println("9�� Ȧ���ΰ�? "+ result);
		
	}
}
