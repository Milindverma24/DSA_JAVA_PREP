class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int count=0;
        for (int i =0 ; i <len;i++){
            if(i<len-1 && nums[i+1]<nums[i]){
                count++;
            }
            else if(i==len-1&&nums[len-1]>nums[0]){
                count++;
            }

        }
        return (count>1) ? false:true;
        
    }
}