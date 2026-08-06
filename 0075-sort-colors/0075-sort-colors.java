class Solution {
    public void swap(int [] arr,int temp1,int temp2){
        int temp=arr[temp1];
        arr[temp1]=arr[temp2];
        arr[temp2]=temp;
    }
    public void sortColors(int[] nums) {
      int low=0;
      int mid=0;
      int high=nums.length-1;
      while(mid<=high){
        if(nums[mid]==0){
            swap(nums,low,mid);
            low++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums,mid,high);
            high--;
        }

      }
        
    }
}