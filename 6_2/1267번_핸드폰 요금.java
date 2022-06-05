import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
	
        int n = sc.nextInt();
        int K;
        int 영식 = 0, 민식 = 0;
	
        for (int i = 0; i < N; i++) {
            K = sc.nextInt();
            영식 += ((K / 30) + 1) * 10;
            민식 += ((K / 60) + 1) * 15;
 
        }
        if (영식 == 민식) {
            System.out.println("Y M " + 영식);
        } else if (영식 < 민식) {
            System.out.println("Y " + 영식);
        } else if (영식 > 민식) {
            System.out.println("M " + 민식);
        }
    }
}
