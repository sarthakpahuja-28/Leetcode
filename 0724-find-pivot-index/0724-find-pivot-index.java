class Solution {
    public int pivotIndex(int[] nums) {
        int [] prefixSum=new int [nums.length];
        int [] suffixSum=new int [nums.length];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            prefixSum[i]=sum1+nums[i];
            suffixSum[nums.length-i-1]=sum2+nums[nums.length-1-i];
            sum1=sum1+nums[i];
            sum2=sum2+nums[nums.length-1-i];
        }
        int x=-1;
        for(int i=0;i<nums.length;i++){
               if(prefixSum[i]==suffixSum[i]){
                x=i;
                break;
               }
        }
        return x;
    } 
}