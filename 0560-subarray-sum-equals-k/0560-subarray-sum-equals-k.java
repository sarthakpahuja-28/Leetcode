class Solution {
    public int subarraySum(int[] nums, int k) {
    //     int [] prefix=new int[nums.length];
    //     prefix[0]=nums[0];
    //    for(int i=1;i<prefix.length;i++){
    //       prefix[i]=prefix[i-1]+nums[i];
    //    }
    //    int i=0;
    //    int j
    int count=0;
    for(int i=0;i<nums.length;i++){
        int sum=0;
        for(int j=i;j<nums.length;j++){
            sum=sum+nums[j];
            if(sum==k){
                count++;
            }
        }
    }
    return count;
    }
}