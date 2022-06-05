import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 1;
		
		while(N != 0) { // 입력받은 수 N이 0이 아닐 때까지 반복
			sum = sum * N;
			N--;
		}
		System.out.println(sum);
	}
}
/* 1*10 = 10 -> 곱해진 값들이 sum에 저장이 되고 N이 0이 되기 전까지 반복이 되고
 * N은 1씩 감소한다. */