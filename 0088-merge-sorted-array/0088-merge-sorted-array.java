class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int i=0;
     int j=0;
     int count=0;
     int [] nums=new int[m+n];
     while( i<m && j<n){
          if(nums1[i]<nums2[j]){
           
            nums[count]=nums1[i];
             i++;
             count++;
          }
          else {
            nums[count]=nums2[j];
             j++;
             count++;
          }
     }
     while(i<m){
        nums[count]=nums1[i];
        i++;
        count++;
     }
     while(j<n){
        nums[count]=nums2[j];
        j++;
        count++;
     }
     for(int k=0;k<nums.length;k++){
        nums1[k]=nums[k];
     }
     
      
    }
}