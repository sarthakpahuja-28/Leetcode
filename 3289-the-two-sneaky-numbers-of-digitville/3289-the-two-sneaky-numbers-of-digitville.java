class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet <Integer> set =new HashSet<>();
        int [] arr=new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==2) break;
            if(!set.contains(nums[i])) set.add(nums[i]);
            else{
                arr[count]=nums[i];
                count++;
            }
        }
        return arr;
    }
}