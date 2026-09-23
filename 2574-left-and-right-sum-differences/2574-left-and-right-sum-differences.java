class Solution {
    public int[] leftRightDifference(int[] nums) {
        int size=nums.length;
        int [] pre = new int[size];
        int [] suf=new int[size];
        pre[0]=nums[0];
        suf[size-1]=nums[size-1];
        for(int i=1;i<size;i++){
            pre[i]=pre[i-1]+nums[i];
            suf[size-i-1]=suf[size-i]+nums[size-i-1];
        }
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=suf[i]-pre[i];
            if(arr[i]<0){
                arr[i]=arr[i]*-1;
            }
        }
        return arr;
    }
}