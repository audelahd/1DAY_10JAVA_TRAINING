package mo04.day13;
import java.util.Random;

public class FingerFlashing {

	public static void main(String[] args) {
		//생성된 난수에 따라 가위바위보 중 하나를 표시

		Random rand = new Random();
		
		System.out.println("컴퓨터가 낸 것 : ");
		
		int hand = rand.nextInt(3);
		
		switch(hand) { //스위치, 케이스 문을 사용한 일방 가위바위보 
		case 0 : System.out.println("가위"); break;
		case 1 : System.out.println("바위"); break;
		case 2 : System.out.println("보"); break;
		}
		
	}

}
