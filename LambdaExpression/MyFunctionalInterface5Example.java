package day13.LambdaExpression;

public class MyFunctionalInterface5Example {
	public static void main(String ar[]){
		UsingLocalVariable ulv=new UsingLocalVariable();
		ulv.method(20);
	}
}

class UsingLocalVariable{
	void method(int arg){ //arg�� final�� Ư���� ����
		int localVar=40; // localVar�� final�� Ư���� ����
		
		//final�� Ư���� ������ �ϹǷ� ������ �Ұ����ϴ�.
		//arg=30;
		//localVar=22;
		
		//���ٽ�
		MyFunctionalInterface5 fi=()->{
			//���� ���� �б�
			System.out.println("arg: "+ arg);
			System.out.println("localVar: "+ localVar+"\n");;
		};
		fi.method();
	}
}
