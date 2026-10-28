class Solution {
    public int removeDuplicates(int[] nums) {
          int cur=0;
          int nex=1;
          if(nums.length==1) return 1;
          while(nex<nums.length){
            if(nums[cur]!=nums[nex]){
                 cur++;
                 nums[cur]=nums[nex];
            }
            else nex++;
          }
          return cur+1;
    }
}