package mo05.day01;


class Human2 {
	String name; 
	int height;
	int weight;
	Day birthday;
	
	public Human2() { }
	
	public Human2(String name, int height, int weight, Day birthday) {
		this.name= name; this.height=height; this.weight =weight; this.birthday= new Day(birthday);
	}
	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	public Day getBirthDay() {return new Day(birthday);}
	
	public void gainWeight(int w) {weight +=w;}
	public void reduceWeight(int w) {weight -=w;}
	
	public void putData() {
		System.out.println("이름:"+name);
		System.out.println("신장:"+height+"cm");
		System.out.println("체중:"+weight+"kg");
	}
	
	public String toString() {
		return "{"+name+" :"+height+"cm "+weight+"kg "+birthday+"출생}";
	}

}

public class HumanTester {


	public static void main(String[] args) {
		Human2 gildong = new Human2("길동",170,60,new Day(1975,3,12));
		Human2 chulsu = new Human2("철수",166,72,new Day(1987,10,7));
		


		System.out.println("gildong ="+gildong);
		System.out.println("chulsu ="+chulsu);
		

	}

}
