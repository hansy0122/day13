package day13.LambdaExpression;
import java.util.Comparator;
import java.util.function.*;

public class OperatorMinByMaxByOperator {
	public static void main(String ar[]){
		
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;   
		// (f1, f2) -> {return Integer.compare(f1.price,f2.price);는  comparator.compare을 람다식으로 정의 한것.
		//f1과 f2는 	BinaryOperator<Fruit>에 의해서 자동적으로 Fruit로 지정되어짐.
		binaryOperator=BinaryOperator.maxBy((f1, f2) -> {return Integer.compare(f1.price,f2.price);});
		// return (a, b) -> comparator.compare(a, b) >= 0 ? a : b; 를 리턴함. <--ㅡmax의 경우  <-- BinaryOperator<T> 값의 구현 객체임.(람다식)
		//즉 위의  식이 binaryOperator.apply(T o1, T o2)의 구현이 되는 것 
			fruit=binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 16000));
			System.out.println(fruit.name);
			
			
			
		binaryOperator=BinaryOperator.minBy((f1, f2) -> {return Integer.compare(f1.price,f2.price);});
		fruit=binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 16000));
		System.out.println(fruit.name);
		
	}
	
	
}
class Fruit{
	public String name;
	public int price;
	public Fruit(String n,int p){
		this.name=n;
		this.price=p;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
