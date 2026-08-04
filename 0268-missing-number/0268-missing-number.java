class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        if (arr[0] != 0) {

            return 0;

        }
        for (int i =0; i<len-1;i++){
            if (arr[i]!=arr[i+1]-1){
                return arr[i]+1;
            }
        }
        return len;
    }
}