class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
       int [] b = new int[nums.length];
       for(int i=0;i<nums.length;i++){
        b[i]=nums[i];
       }
       Arrays.sort(b);
       HashMap <Integer,Integer> map =new HashMap<> ();
       for(int i=0;i<b.length;i++){
         if(!map.containsKey(b[i])){
            map.put(b[i],i);
         }
         else{
            continue;
         }
       }
       int [] arr=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        arr[i]=map.get(nums[i]);
       }
       return arr;
        
    }
}