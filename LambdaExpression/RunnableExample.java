package day13.LambdaExpression;

public class RunnableExample {
	public static void main(String ar[]){
		Runnable run=()->{
			for(int i=0; i<11;i++){
				System.out.println(i);;
			}
		};
		
		Thread thread =new Thread(run);
		thread.start();
		
	}
}
