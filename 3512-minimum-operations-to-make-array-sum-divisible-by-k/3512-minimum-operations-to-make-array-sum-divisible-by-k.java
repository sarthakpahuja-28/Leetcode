class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%k==0) return 0;
        int count=0;
        while(sum>=0){
            count++;
            sum--;
            if(sum%k==0) return count; 
        }
        return 0;
    }
}