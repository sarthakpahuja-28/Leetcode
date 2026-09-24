class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
          int x=nums[i];
          if(x==i && x <= 9) return i;
          else if(x>9){
            int sum=0;
            while(x>0){
                sum=sum+x%10;
                
                 if(sum>i){
                    break;
                }
                x=x/10;
                
            }
            if(sum == i){
                    return i;
                }
          }

        }
        return -1;
        
    }
}