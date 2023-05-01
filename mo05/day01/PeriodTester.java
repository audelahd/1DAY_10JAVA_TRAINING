package mo05.day01;

public class PeriodTester {

	public static void main(String[] args) {
		Period taejo = new Period(new Day(1392,8,5),new Day(1398,10,14));
		Period jeongjong = new Period(new Day(1398,10,14),new Day(1400,11,28));
		Period taejong = new Period(new Day(1400,11,28),new Day(1418,9,9));
		
		System.out.println("태조 :"+taejo);
		System.out.println("정종 :"+jeongjong);
		System.out.println("태종 :"+taejong);

	}

}
