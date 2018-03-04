package day13.LambdaExpression;
// 사용을 위해서는 ConsumerAndThenExample의 member와 Address 클래스를 사용해야함.
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
		city=functionAB.apply(new Member("홍길동","남자",new Address("한국","서울")));
		System.out.println("거주도시="+ city);
		
		
		functionAB=functionB.compose(functionA);
		city=functionAB.apply(new Member("홍길동","남자",new Address("한국","서울")));
		System.out.println("거주도시="+ city);
	}
		
}
