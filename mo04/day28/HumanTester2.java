package mo04.day28;

class Human2{
	private String name;
	private int height;
	private int weight;
	
	Human2(String n, int h, int w){
		name=n; height = h; weight=w;
	}
	

	String getName() {return name;}
	int getHeight() {return height;}
	int getWeight() {return weight;}
	
	void gainWeight(int w) {weight +=w;}
	void reduceWeight(int w) {weight -=w;}
}


public class HumanTester2 {

	public static void main(String[] args) {
		Human2 gildong = new Human2("길동", 170,60);
		Human2 chulsu = new Human2("철수", 166,72);
		
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println("이름 : "+gildong.getName());
		System.out.println("신장 : "+gildong.getHeight()+"cm");
		System.out.println("체중 : "+gildong.getWeight()+"cm");
		System.out.println();
		
		System.out.println("이름 : "+chulsu.getName());
		System.out.println("신장 : "+chulsu.getHeight()+"cm");
		System.out.println("체중 : "+chulsu.getWeight()+"cm");

	}

}
