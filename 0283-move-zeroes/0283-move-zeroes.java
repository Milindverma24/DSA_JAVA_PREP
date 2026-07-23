class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int nz =0;
        int z=0;
        for (int i=0;i<len;i++){
            if (nums[nz]!=0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            }
            else if (nums[nz]==0){
                nz++;

            }
        }
        
    }
}