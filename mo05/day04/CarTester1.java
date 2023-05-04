package mo05.day04;

public class CarTester1 {

	public static void main(String[] args) {
		Car car1 = new Car("W140",1885,1490,5220,95.0,new Day(2018,10,13));
		ExCar car2 = new ExCar("W221",1845,1490,5205,90.0,new Day(2015, 12, 24));

		Car x;
		x = car1;
		x = car2;
		
		System.out.println("x구입일 : "+ x.getPurchaseDay());
		
		ExCar y;
		//y = car1;
		y = car2;
		
		System.out.println("y구입일 : "+ y.getPurchaseDay());
		System.out.println("y의 총 주행거리 : "+y.getTotelMileage());
	}

}
