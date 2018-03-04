package day13.LambdaExpression;

public class MyFunctionalInterface2Example {
	public static void main(String ar[]){
		
		MyFunctionalInterface2 fi;
		
		fi=(int x)->{
		int result =x*5;
		System.out.println(result);
		};
		
		fi.method(2);
		
		//매게변수가 1개일때는 ()생략이 가능하다.
		fi= x->System.out.println(x*5);
		fi.method(3);
		}
		
	}

