class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] pre = new int[nums.length];
        int [] suf=new int[nums.length];
        pre[0]=nums[0];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
            suf[nums.length-i-1]=suf[nums.length-i]+nums[nums.length-i-1];
        }
        int [] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=suf[i]-pre[i];
            if(arr[i]<0){
                arr[i]=arr[i]*-1;
            }
        }
        return arr;
    }
}