package acadgild;
import java.util.Random;
import java.util.Scanner;
public class RandomGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number N for Random Number Generator");
		int N = in.nextInt();
		System.out.println(r.nextInt(N));
		
	}

}
