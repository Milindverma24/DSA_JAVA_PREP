package Two_PointerBasic;

import java.util.Scanner;

public class Rotatingarraybyktimes {
    public static void rotate(int[] arr){
        int start = arr[arr.length-1];
        for (int i =arr.length -1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0]=start;
    }
    public  static void ktimes(int[] arr , int k ){
        for (int i=0; i<k;i++){
            rotate(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("print the number of array elements you want ::");
        int h = sc.nextInt();
        System.out.println("How may time you want me to rotate the array ::");
        int k = sc.nextInt();
        int[] arr = new int[h];
        for (int i =0 ;i <h;i++){
            arr[i]=sc.nextInt();
            System.out.println("Array To " +arr[i]);
        }
        ktimes(arr,k);

        System.out.println("Reversed Array:");

        for (int i = 0; i < h; i++) {

            System.out.print(arr[i] + " ");

        }
        sc.close();
    }
}


