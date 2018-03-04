package day13.LambdaExpression;

import java.util.function.*;

public class ConsumerExample {
	public static void main(String ar[]) {
		Consumer<String> consumer = t -> System.out.println(t = "8");
		consumer.accept("java");

		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("java", " good");

		DoubleConsumer doubleConsumer = (d) -> System.out.println("java" + d);
		doubleConsumer.accept(8.0);

		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("java", 8);

	}
}
