package mo05.day03;

import java.util.*;
import static java.lang.Math.*;

public class MathMethods {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("실  수");
		double x = stdIn.nextDouble();

		System.out.println("절댓값: "+abs(x));
		System.out.println("제곱근: "+sqrt(x));
		System.out.println("넓 이: "+PI*x*x);
	}

}
