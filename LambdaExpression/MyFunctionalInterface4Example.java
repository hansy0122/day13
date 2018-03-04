package day13.LambdaExpression;

public class MyFunctionalInterface4Example {
	public static void main(String ar[]){
		UsingThis usingthis =new UsingThis();
		UsingThis.Inner inner = usingthis.new Inner();
		inner.method();
	}
}

class UsingThis{
public int outterField =10;
	
	class Inner{
		int innerField =20;
		
		void method(){
			//���ٽ�
			MyFunctionalInterface4 fi=()->{
				System.out.println("outterField: "+outterField);
				//�ٱ� ��ü�� ������ ��� ���ؼ��� Ŭ������.this�� ���
				System.out.println("outterField: "+ UsingThis.this.outterField+"\n");
				
				System.out.println("innerField: "+ innerField );
				//���ٽ� ���ο��� this�� Inner ��ü�� ����
				System.out.println("innerField: "+ this.innerField);
			};
			fi.method();
		}
	}
}
