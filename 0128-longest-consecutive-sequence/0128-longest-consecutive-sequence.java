class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==1){
            return 1;
        }
        if(nums.length==0){
            return 0;
        }
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        if(set.size()==1){
            return 1;
        }
        int [] res=new int[set.size()];
        int j=0;
        for(int key:set){
            res[j]=key;
            j++;
        }
        Arrays.sort(res);
        int count=0;
        int max=0;
        for(int i=1;i<res.length;i++){
            if(res[i]-1==res[i-1]){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        return max+1;
    }
}