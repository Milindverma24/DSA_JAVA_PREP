class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int x = 0;
        for (int i =0 ; i<len ; i++){
            if(nums[i]!=nums[x]){
                x=x+1;
                nums[x]=nums[i];
            }
            
            
        }
        return x+1;
    }
}