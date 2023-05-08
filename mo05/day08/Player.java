package mo05.day08;


import java.util.Random;
import java.util.Scanner;

public abstract class Player {
	int hand;
	public abstract int nextHand();
}

class HumanPlayer extends Player{
	private static Scanner stdIn;
	static {
		stdIn = new Scanner(System.in);
	}
	
	public int nextHand() {
		do {
			System.out.print("가위바위보! 0...가위 1...바위 2...보 : ");
			hand = stdIn.nextInt();
			
		}while (hand<0||hand>2);
		return hand;
	}
}

class ComputerPlayer extends Player{
	private static Random rand;
	static {
		rand = new Random();
	}
	public int nextHand() {
		return rand.nextInt(3);
	}
}