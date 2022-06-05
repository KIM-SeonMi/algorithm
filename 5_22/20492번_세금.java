import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 상금
		
		double a = (n - (n*0.22));
		double b = n*0.8 + ((n*0.2) - ((n*0.2) * 0.22));
		System.out.println((int) a);
		System.out.println((int) b);
	}
}