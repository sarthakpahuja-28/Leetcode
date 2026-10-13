class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double x=0;
        for(int i=0;i<k;i++){
            x+=nums[i];
        }
        double max=x/k;
        for(int i=k;i<nums.length;i++){
            x=x+nums[i]-nums[i-k];
            if((x/k)>max) max=(x/k);
        }
        return max;
    }
}