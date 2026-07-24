import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len/2];
        int[] num = new int[len/2];
        int p =0;
        int n=0;
        for (int i =0 ; i<len;i++){
            if (nums[i]<0){
                arr[n]=nums[i];
                n++;
            }
            else if (nums[i]>0){
                num[p]=nums[i];
                p++;
            }
        }
        n = 0;
        p=0;
        int[] ans = new int[len];
        for(int i=0;i<len;i+=2){
            ans[i]=num[p];
            ans[i+1]=arr[n];
            n++;
            p++;
        }
        return ans;

        
    }
}