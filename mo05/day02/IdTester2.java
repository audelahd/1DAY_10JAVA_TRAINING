package mo05.day02;

class Id2{
	private static int counter =0;
	private int id;
	
	public Id2() {
		id= ++counter;
	}
	
	public int getId2() {
		return id;
	}
	public static int getMaxId() {
		return counter;
	}
}

public class IdTester2 {

	public static void main(String[] args) {

		Id2 a2 = new Id2();
		Id2 b2 = new Id2(); 
		

		System.out.println("a의 식별 번호 :"+a2.getId2());
		System.out.println("b의 식별 번호 :"+b2.getId2());
		
		System.out.println("마지막으로 부여한 식별 번호 ="+Id2.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호 ="+a2.getMaxId());
		System.out.println("마지막으로 부여한 식별 번호 ="+b2.getMaxId());
	}
	

}
