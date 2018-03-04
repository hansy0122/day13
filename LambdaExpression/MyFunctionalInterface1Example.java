package day13.LambdaExpression;

public class MyFunctionalInterface1Example {
	public static void main(String ar[]){
		
		MyFunctionalInterface1 fi;
		fi=() ->{
			String str="method call";
			System.out.println(str);
		};
		fi.method();
		
		fi=() ->{
			
			System.out.println("method call2");
		};
		fi.method();
		
		//실행문이 1개라서 중괄호생략 가능
		fi=() ->System.out.println("method call3");
		fi.method();
		
	}
	
}
