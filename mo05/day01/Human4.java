package mo05.day01;

public class Human4 {

	private String name;
	private int height;
	private int weight;
	
	
	Human4 (String n, int h, int w) {
		name = n; height = h; weight=w;
		
	}
	
	 String getName() {return name;}
	 int getHeight() {return height;}
	 int getWeight() {return weight;}
	
	 void gainWeight(int w) {weight +=w;}
	 void reduceWeight(int w) {weight -=w;}
	
	
	
	
	public static void main(String[] args) {
		Human4 gildong= new Human4("홍길동",170,60);
		Human4 chulsu = new Human4("김철수",166,72);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println("이름 : "+gildong.getName());
		System.out.println("신장 : "+gildong.getHeight()+"cm");
		System.out.println("체중 : "+gildong.getWeight()+"kg");
		System.out.println();
		
		System.out.println("이름 : "+chulsu.getName());
		System.out.println("신장 : "+chulsu.getHeight()+"cm");
		System.out.println("체중 : "+chulsu.getWeight()+"kg");
		
	}
	

}


