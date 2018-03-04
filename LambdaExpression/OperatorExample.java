package day13.LambdaExpression;

import java.util.function.*;

public class OperatorExample {
	public static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String ar[]) {
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println(max);

		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println(min);

	}
}
