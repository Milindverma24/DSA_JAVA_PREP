class Solution {
    public String reverseWords(String s) 
    {
        
    String[] words = s.split(" ");
    StringBuilder ans = new StringBuilder();


    for(int i =0;i<words.length;i++)
    {
        char[] word = words[i].toCharArray();
        int left =0;
        int right=word.length-1;

        while(left<right){
            char temp = word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        ans.append(new String(word));
        if (i != words.length - 1) {
        ans.append(" "); 
        }
    }
    return ans.toString();
    }
}