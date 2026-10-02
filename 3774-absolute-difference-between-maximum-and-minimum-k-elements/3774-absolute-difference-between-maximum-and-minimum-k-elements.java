class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums); 
        int min=0;
        int max=0;
        for(int i=0;i<k;i++){
           min=min+nums[i];
           max=max+nums[nums.length-i-1];
        }
        return max-min;
    }
}