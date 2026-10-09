class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size=nums.length;
        int p=1;
        int s=nums[0]*nums[1]*nums[size-1];
        for(int i=size-1;i>=size-3;i--){
           p=p*nums[i];
        }
       if(s>p) return s;
       else return p;
    }
}