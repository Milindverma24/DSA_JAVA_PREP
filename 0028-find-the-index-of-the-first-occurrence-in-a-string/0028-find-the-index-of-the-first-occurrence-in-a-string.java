class Solution {
    public int strStr(String hasystack, String needle) {
        for(int i =0;i<hasystack.length()-needle.length()+1;i++){
            if(hasystack.charAt(i)==needle.charAt(0)){
                if(hasystack.substring(i,needle.length()+i).equals(needle)){
                    return i ;
                }
                
            }
            
        }  
        return -1;
    }
}