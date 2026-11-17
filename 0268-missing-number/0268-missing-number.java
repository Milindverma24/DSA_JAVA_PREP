class Solution {
    public int missingNumber(int[] arr) {
        int l= arr.length+1;
        int xor1 =0;
        int xor2 =0;
        for(int i =0 ;i<l-1;i++){
            xor1^=arr[i];
        }
        for (int i =0 ; i<l;i++){
            xor2^=i;

        }
        return xor1^xor2;
    }
}