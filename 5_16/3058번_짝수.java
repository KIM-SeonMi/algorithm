import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[7];

        for (int i = 0 ; i < T; i++) {
            int sum = 0;
            int max = 102;
            int min = 101;
            for (int j = 0 ; j < 7; j++) {
                arr[j] = sc.nextInt();

                if ((arr[j] % 2) == 0) {
                    even = arr[j];
                    sum += max;
                }
                if (min > max) {
                    min = max;
                }
            }
            System.out.println(sum + " " +min);
        }
    }
}