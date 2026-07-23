package Arrays;
import java.util.Scanner;

public class jumpinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        int jumps = 0;

        while (index < n - 1) {
            if (arr[index] == 0) {
                System.out.println("Cannot move further");
                return;
            }

            index = index + arr[index];
            jumps++;
        }

        System.out.println(jumps);

        sc.close();
    }
}