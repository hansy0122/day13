package day13.LambdaExpression;
import java.util.Comparator;
import java.util.function.*;

public class OperatorMinByMaxByOperator {
	public static void main(String ar[]){
		
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;   
		// (f1, f2) -> {return Integer.compare(f1.price,f2.price);��  comparator.compare�� ���ٽ����� ���� �Ѱ�.
		//f1�� f2�� 	BinaryOperator<Fruit>�� ���ؼ� �ڵ������� Fruit�� �����Ǿ���.
		binaryOperator=BinaryOperator.maxBy((f1, f2) -> {return Integer.compare(f1.price,f2.price);});
		// return (a, b) -> comparator.compare(a, b) >= 0 ? a : b; �� ������. <--��max�� ���  <-- BinaryOperator<T> ���� ���� ��ü��.(���ٽ�)
		//�� ����  ���� binaryOperator.apply(T o1, T o2)�� ������ �Ǵ� �� 
			fruit=binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 16000));
			System.out.println(fruit.name);
			
			
			
		binaryOperator=BinaryOperator.minBy((f1, f2) -> {return Integer.compare(f1.price,f2.price);});
		fruit=binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 16000));
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
