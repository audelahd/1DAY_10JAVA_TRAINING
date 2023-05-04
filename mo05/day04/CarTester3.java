package mo05.day04;

public class CarTester3 {

	public static void main(String[] args) {
		Car car1 = new ExCar("W221", 1845, 1490, 5205, 90.0, new Day(2015, 12,24));
		car1.move(10, 10);
		
		//System.out.println("총 주행거리 : "+car1.getTotalMileage());
		System.out.println("총 주행거리 : "+((ExCar)car1).getTotelMileage());

	}

}
