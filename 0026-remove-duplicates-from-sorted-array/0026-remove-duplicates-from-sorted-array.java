class Solution {
    public int removeDuplicates(int[] nums) {
        int curr=0;
        int nex=1;
        if(nums.length==1) return 1;
        while(nex<nums.length){
            if(nums[curr]!=nums[nex]){
                curr++;
                nums[curr]=nums[nex];
            }
            else{

                nex++;
            }
        }
        return curr+1;
    }
}