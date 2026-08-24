class Solution {
    public int findFinalValue(int[] nums, int original) {
           HashSet <Integer> set=new HashSet<>();
           for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
           }
           int prod=original;
                      int temp=original;

           boolean flag=false;
           int count=0;
           while(count<set.size()){
            if(set.contains(prod)){
                prod=prod*2;
                flag=true;
                count++;
            }
            else{
                break;
            }
           }
           if(flag){
            return prod;
           }
           return temp;
    }
}