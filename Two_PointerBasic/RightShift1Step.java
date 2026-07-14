package Two_PointerBasic;

import java.util.Scanner;

public class RightShift1Step {
    public void right(int[] arr){
        int m = arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=m;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int h = sc.nextInt();
        int[] arr = new int[h];
        for (int i =0 ;i <h;i++){
            arr[i]=sc.nextInt();
            System.out.println("Array To " +arr[i]);
        }
        RightShift1Step obj = new RightShift1Step();
        obj.right(arr);

        System.out.println("Shifted Array:");

        for (int i = 0; i < h; i++) {

            System.out.print(arr[i] + " ");

        }
        sc.close();
    }
}