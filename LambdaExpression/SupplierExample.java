package day13.LambdaExpression;
import java.util.function.*;
public class SupplierExample {
	public static void main(String  ar[]){
		IntSupplier intSupplier =()->{
			int num=(int)(Math.random()*6)+1;
			return num;
		};
		
		int num= intSupplier.getAsInt();
		System.out.println("´«ÀÇ ¼ö: "+num);
		
		
		Supplier<?> supplier =()->{return null;};
		Supplier<?> supplier2 =new Supplier(){
			

			@Override
			public Object get() {
				// TODO Auto-generated method stub
				return null;
			}
};
}}
