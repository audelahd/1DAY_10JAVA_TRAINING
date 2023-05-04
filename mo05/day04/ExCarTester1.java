package mo05.day04;

public class ExCarTester1 {

	public static void main(String[] args) {

		ExCar myCar = new ExCar("W221",1845,1490,5205,90.0,new Day(2015,12,24));
		
		System.out.printf("현재 위치 : (%.2f,%.2f)\n", myCar.getX(), myCar.getY());
		System.out.printf("남은 연료 : %.2f리터\n", myCar.getFuel());
		System.out.printf("구 입 일 : %s\n", myCar.getPurchaseDay());
	}

}
