package day13.LambdaExpression;
import java.util.*;
import java.util.function.*;

public class FunctionExample1 {
	private static List<Student> list =Arrays.asList(
			new Student("ȫ�浿",90,96),new Student("�ſ��",95,93));
	
	public static void printString(Function<Student,String> function ){
		for(Student student: list){ //list�� ����� �׸� ����ŭ ����
			System.out.println(function.apply(student)+ " "); //���ٽ� ����
		}
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function){
		for(Student student: list){ //list�� ����� �׸� ����ŭ ����
			System.out.println(function.applyAsInt(student)+ " "); //���ٽ� ����
		}
		System.out.println();
	}
	
	public static void main(String ar[]){
		System.out.println("[�л��̸�]");
		printString((t)->{return t.getName();}); //���ٽ��� ����ϴ°Ű� Function.apply()�� ������ �ϴ� ����. 
		System.out.println("[��������]");
		printInt(t->t.getEnglishScore());
		System.out.println("[��������]");
		printInt(t->t.getMathScore());
		
		FunctionExample2 fe=new FunctionExample2();
		fe.start();
	}
	
	
	
}

class FunctionExample2 extends Thread{
	private static List<Student> list= Arrays.asList(new Student("ȫ�浿",90,96),new Student("�ſ��",95,93));
	
	public static double avg( ToIntFunction<Student> function){
		int sum =0;
		for(Student student:list){
			sum+= function.applyAsInt(student); // ���ٽ� ����
		}
		double avg=(double) sum/list.size();
		return avg;
	}
	
	public void run(){
		//double englishAvg=avg(s->s.getEnglishScore());
		double englishAvg=avg(Student::getEnglishScore);
		System.out.println("�����������:"+englishAvg);
		
		double mathAvg=avg(s->s.getMathScore());
		System.out.println("�����������:"+mathAvg);
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