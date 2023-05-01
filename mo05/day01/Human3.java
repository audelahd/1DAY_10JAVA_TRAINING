package mo05.day01;

public class Human3 {
	private static int counter =0;
	private String name;
	private int height;
	private int weight;
	private int id;
	
	public Human3 (String name, int height, int weight) {
		this.name = name; this.height = height; this.weight=weight;
		id= ++counter;
	}
	
	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	
	public void gainWeight(int w) {weight +=w;}
	public void reduceWeight(int w) {weight -=w;}
	
	public int getid() {return id;}
	
	public void putData() {
		System.out.println("이름:"+name);
		System.out.println("신장:"+height+"cm");
		System.out.println("체중:"+weight+"kg");
		
	}
	
	public static void main(String[] args) {
		Human3 gildong= new Human3("홍길동",170,60);
		Human3 chulsu = new Human3("김철수",166,72);
		
		gildong.putData();
		System.out.println("번호 :"+gildong.getid());
		
		System.out.println();
		
		chulsu.putData();
		System.out.println("번호 : "+chulsu.getid());
		
	}
	

}


