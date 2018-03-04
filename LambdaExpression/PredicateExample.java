package day13.LambdaExpression;

import java.util.function.*;
import java.util.*;

public class PredicateExample {
	private static List<Univ> list =Arrays.asList(
			new Univ("�����","��",90),
			new Univ("������","��",72),
			new Univ("�����","��",20),
			new Univ("���δ�","��",80)
			);
	
	public static double avg(Predicate<Univ> predicate){
		int count =0; int sum=0;
		for(Univ univ : list){
			if(predicate.test(univ)){
			count++;
			sum+=univ.getScore();
		}
		}
		return (double) sum/count;
	}
	
	public static void main(String ar[]){
		double maleAvg =avg( t-> t.getSex().equals("��"));
		System.out.println("�����������="+ maleAvg);
		double femaleAvg =avg( t-> t.getSex().equals("��"));
		System.out.println("�����������="+ femaleAvg);
	}
	
	
	
}

class Univ {
	private String name;
	private String sex;
	private int score;
	
	public Univ(String n, String sex,int sc){
		this.name=n;
		this.sex=sex;
		this.score=sc;
	}
	public String getSex(){return sex;}
	public int getScore(){return score;}
}