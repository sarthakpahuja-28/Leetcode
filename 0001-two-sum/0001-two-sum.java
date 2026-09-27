class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
             map.put(nums[i],i);
        }
        int [] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                if(map.get(diff)>i){
               arr[0]=i;
               arr[1]=map.get(diff);
               break;
                }
            }
        }
        return arr;
    }
}