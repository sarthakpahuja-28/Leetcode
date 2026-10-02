class Solution {
    public int maximizeExpressionOfThree(int[] nums) 
    {
        int size=nums.length;
        Arrays.sort(nums);
        return nums[size-1]+nums[size-2]-nums[0];
    }
}