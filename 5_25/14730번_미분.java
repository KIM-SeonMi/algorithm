import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mul = 0;
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int k = sc.nextInt();
			mul += c * k;
			// mul = mul + (c*k)
		}
		System.out.println(mul);
	}
}