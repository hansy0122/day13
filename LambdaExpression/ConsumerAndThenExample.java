package day13.LambdaExpression;
import java.util.function.*;

public class ConsumerAndThenExample {
	public static void main(String ar[]){
		Consumer<Member> consumerA =(m)->{
			System.out.println(m.getName());
		};
		
		Consumer<Member> consumerB =(m)->{
			System.out.println(m.getSex());
		};
		Consumer<Member> consumerAB=consumerA.andThen(consumerB);
		consumerAB.accept(new Member("È«È«½Â","³²ÀÚ",null));
		
	}
	
}

class Member {
	private String name;
	private String sex;
	private Address address;
	
	public Member(String name, String sex, Address address){
		this.name=name;
		this.sex=sex;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Address getAddress(){ return address;}
}

class Address {
	private String country;
	private String city;
	
	public String getCountry() {
		return country;
	}

	

	public String getCity() {
		return city;
	}

	public Address(String co, String city){
		this.city=city;
		this.country=co;
	}
}