package day13.LambdaExpression;
// ����� ���ؼ��� ConsumerAndThenExample�� member�� Address Ŭ������ ����ؾ���.
import java.util.function.*;
public class FunctionAndThenComposeExample {
	public static void main(String ar[]){
		Function<Member,Address> functionA;
		Function<Address,String> functionB;
		Function<Member,String> functionAB;
		String city;
		
		functionA =(m)->m.getAddress();
		functionB=(Address a)->{return a.getCity();};
		functionAB=functionA.andThen(functionB);
		city=functionAB.apply(new Member("ȫ�浿","����",new Address("�ѱ�","����")));
		System.out.println("���ֵ���="+ city);
		
		
		functionAB=functionB.compose(functionA);
		city=functionAB.apply(new Member("ȫ�浿","����",new Address("�ѱ�","����")));
		System.out.println("���ֵ���="+ city);
	}
		
}
