class Solution {
    public  int missingNumber(int[] nums) {
        int sum=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+i+1;
            temp=temp+nums[i];
        }
        return sum-temp;
    }
}