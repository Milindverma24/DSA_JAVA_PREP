class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for(int i =0;i<s.length();i++){
            char l =s.charAt(i);
            char p = t.charAt(i);

            if(map1[l]!=map2[p]){
                return false;
            }

            map1[l]=i+1;
            map2[p]=i+1;
        }
        return true;
        
    }
}