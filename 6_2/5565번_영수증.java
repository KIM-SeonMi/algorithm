import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int total, price, sum = 0;

		Scanner sc = new Scanner(System.in);
		total = sc.nextInt();
		
		for(int i = 0 ; i < 9; i++) {
			price = sc.nextInt();
			sum += price;
		}
		System.out.println(total - sum);
	}
}

