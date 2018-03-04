package day13.LambdaExpression;

@FunctionalInterface
public interface MyFunctionalInterface1 {
	public void method();
	//@FunctionalInterface 에의해 두개이상의 추상메소드가 선언되면 함수적 인터페이스가 아니라고 간주하고 compile erroe 발생
	//public void othermethod();
	
}
