import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0, T;
		 T = sc.nextInt();
		 
		for(int i = 1; i <= T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.print("Case #" + i + ": ");
			System.out.println(A + B);
		}
	}
}