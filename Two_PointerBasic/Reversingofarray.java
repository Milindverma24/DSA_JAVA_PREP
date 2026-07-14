package Two_PointerBasic;

import java.util.Scanner;

public class Reversingofarray {
    public void rev(int[] arr){
        int i = 0;
        int j=arr.length -1 ;
        while(i<=j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int h = sc.nextInt();
        int[] arr = new int[h];
        for (int i =0 ;i <h;i++){
            arr[i]=sc.nextInt();
            System.out.println("Array To " +arr[i]);
        }
        Reversingofarray obj = new Reversingofarray();
        obj.rev(arr);

        System.out.println("Reversed Array:");

        for (int i = 0; i < h; i++) {

            System.out.print(arr[i] + " ");

        }
        sc.close();
    }
}
