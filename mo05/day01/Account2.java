package mo05.day01;

public class Account2 {
	private String name;
	private String no;
	private long balance;
	private Day openDay;
	
	Account2(String n, String num, long z, Day d){
		name = n;
		no = num;
		balance =z;
		openDay = new Day(d);
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public Day getOpenDay() {
		return new Day(openDay);
	}
	
	void deposit (long k) {
		balance += k;
	}
	
	void withdraw(long k) {
		balance -=k;
	}
	
	public String toString() {
		return "{"+name+", "+no+", "+balance+"}";
	}

}
