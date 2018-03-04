package day13.LambdaExpression;

public class MyFunctionalInterface5Example {
	public static void main(String ar[]){
		UsingLocalVariable ulv=new UsingLocalVariable();
		ulv.method(20);
	}
}

class UsingLocalVariable{
	void method(int arg){ //arg는 final의 특성을 가짐
		int localVar=40; // localVar는 final의 특서을 가짐
		
		//final한 특성을 가져야 하므로 수정이 불가능하다.
		//arg=30;
		//localVar=22;
		
		//람다식
		MyFunctionalInterface5 fi=()->{
			//로컬 변수 읽기
			System.out.println("arg: "+ arg);
			System.out.println("localVar: "+ localVar+"\n");;
		};
		fi.method();
	}
}
