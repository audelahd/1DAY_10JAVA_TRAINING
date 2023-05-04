package mo05.day04;



public class Car {
	
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel; 
	private Day purchaseDay;
	
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.purchaseDay = purchaseDay;
	}
	
	public double getX() {return x;}
	public double getY() {return y;}
	public double getFuel() {return fuel;}
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	public void putSpec() {
		System.out.println("이름 : "+name);
		System.out.println("전폭 : "+width+"mm");
		System.out.println("전고 : "+height+"mm");
		System.out.println("전장 : "+length+"mm");
	}
	
	public boolean move (double dx, double dy) {
		double dist = Math.sqrt(dx*dx+dy*dy);
		
		if(dist>fuel) return false;
		else {
			fuel-= dist;
			x+=dx;
			y+=dy;
			return true;
		}
	
	}
	

}


class ExCar extends Car {
	private double totalMileage;
	public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		totalMileage=0.0;
		
	}
	
	public double getTotelMileage() {
		return totalMileage;
	}
	
	public void putSpec() {
		super.putSpec();
		System.out.printf("총 주행거리 : %.2fkm\n", totalMileage);
	}
	
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx+dy*dy);
		
		if(!super.move(dx, dy))
			return false;
		else {
			totalMileage+=dist;
			return true;
		}
	}
}
	















