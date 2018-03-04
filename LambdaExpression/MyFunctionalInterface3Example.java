package day13.LambdaExpression;

public class MyFunctionalInterface3Example {
	public static void main(String ar[]){
		MyFunctionalInterface3 fi;
		fi=(x,y)->{
			return x+y;
		};
		System.out.println(fi.method(3, 4));
		
		//return 문만있을 경우 중괄호와 return을 같이 생략해야 함. 
		fi=(x,y)-> x+y;
		System.out.println(fi.method(5, 5));
		
		fi=(x,y)-> sum(x,y);
		System.out.println(fi.method(100, 100));
	}
	
	public static int sum(int x,int y){
		return x+y;
	}
}
