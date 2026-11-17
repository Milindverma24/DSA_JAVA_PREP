class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();
        

        int left =0;
        int right=arr.length-1;

        while(left<right){
            if(!Character.isLetterOrDigit(arr[left])){
                left++;
            }
            else if(!Character.isLetterOrDigit(arr[right])){
                right--;
            }
            else {

                    char leftChar = Character.toLowerCase(arr[left]);

                    char rightChar = Character.toLowerCase(arr[right]);

                    if (leftChar != rightChar) {

                        return false;

                    }

                    left++;

                    right--;

                }
            
        }
        return true;
        
    }
}