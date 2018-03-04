package day13.LambdaExpression;
import java.util.*;
import java.util.function.*;

public class FunctionExample1 {
	private static List<Student> list =Arrays.asList(
			new Student("홍길동",90,96),new Student("신용권",95,93));
	
	public static void printString(Function<Student,String> function ){
		for(Student student: list){ //list에 저장된 항목 수만큼 루핑
			System.out.println(function.apply(student)+ " "); //람다식 실행
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function){
		for(Student student: list){ //list에 저장된 항목 수만큼 루핑
			System.out.println(function.applyAsInt(student)+ " "); //람다식 실행
		}
		System.out.println();
	}
	
	public static void main(String ar[]){
		System.out.println("[학생이름]");
		printString((t)->{return t.getName();}); //람다식을 사용하는거고 Function.apply()를 재정의 하는 것임. 
		System.out.println("[영어점수]");
		printInt(t->t.getEnglishScore());
		System.out.println("[수학점수]");
		printInt(t->t.getMathScore());
		
		FunctionExample2 fe=new FunctionExample2();
		fe.start();
	}
	
	
	
}

class FunctionExample2 extends Thread{
	private static List<Student> list= Arrays.asList(new Student("홍길동",90,96),new Student("신용권",95,93));
	
	public static double avg( ToIntFunction<Student> function){
		int sum =0;
		for(Student student:list){
			sum+= function.applyAsInt(student); // 람다식 실행
		}
		double avg=(double) sum/list.size();
		return avg;
	}
	
	public void run(){
		//double englishAvg=avg(s->s.getEnglishScore());
		double englishAvg=avg(Student::getEnglishScore);
		System.out.println("영어점수평균:"+englishAvg);
		
		double mathAvg=avg(s->s.getMathScore());
		System.out.println("수학점수평균:"+mathAvg);
	}
}

class Student{
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int eng, int math){
		this.name=name;
		this.englishScore=eng;
		this.mathScore=math;
	}
	
	public String getName(){return name;}
	public int getEnglishScore(){return englishScore;};
	public int getMathScore(){return mathScore;}
}