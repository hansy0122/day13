package day13.LambdaExpression;

public class MyFunctionalInterface2Example {
	public static void main(String ar[]){
		
		MyFunctionalInterface2 fi;
		
		fi=(int x)->{
		int result =x*5;
		System.out.println(result);
		};
		
		fi.method(2);
		
		//�ŰԺ����� 1���϶��� ()������ �����ϴ�.
		fi= x->System.out.println(x*5);
		fi.method(3);
		}
		
	}

