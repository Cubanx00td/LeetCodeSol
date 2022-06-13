class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m+n;
        m--;
        n--;
        l--;
        while(m>=0 && n>=0){
            if(nums1[m] > nums2[n]){
                nums1[l] = nums1[m];
                m--;
            }
            else{
                nums1[l] = nums2[n];
                n--;
            }
            l--;
        }
        if(m<0){
            while(n>=0){
                nums1[l] = nums2[n];
                n--;
                l--;
            }
        }
      //Another Approach
//       for(int i = 0; i<n; i++){
//             nums1[m+i] = nums2[i];
//         }
//         Arrays.sort(nums1);
    }
}
