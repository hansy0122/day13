package day13.LambdaExpression;

import java.util.function.*;
import java.util.*;

public class PredicateExample {
	private static List<Univ> list =Arrays.asList(
			new Univ("서울대","남",90),
			new Univ("연세대","여",72),
			new Univ("고려대","남",20),
			new Univ("국민대","여",80)
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
		double maleAvg =avg( t-> t.getSex().equals("남"));
		System.out.println("남자평균점수="+ maleAvg);
		double femaleAvg =avg( t-> t.getSex().equals("여"));
		System.out.println("여자평균점수="+ femaleAvg);
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