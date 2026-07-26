class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] temp = new int [m+n];
        int k=0;
        for (int i=0 ; i<m;i++){// here i have added the array into each other 
            temp[k]=nums1[i];
            k++;
        }
        for (int i =0; i<n;i++){
            temp[k]=nums2[i];
            k++;
        }
        for (int i =0 ;i<(m+n)-1;i++){
            for (int j=i+1;j<(m+n);j++){
                if (temp[i] > temp[j]) {
                    int lemp = temp[i];
                    temp[i] = temp[j];
                    temp[j]= lemp;
                }
            }
        }
        for (int i = 0; i < m + n; i++) {// here we have copyied the array in to num1 for the space as the constrain 

            nums1[i] = temp[i];

        }

        for (int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
    }
}