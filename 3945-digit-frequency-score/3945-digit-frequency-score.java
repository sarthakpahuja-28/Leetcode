class Solution {
    public int digitFrequencyScore(int n) {
        HashMap <Integer,Integer> map =new HashMap<>();
        int temp=n;
        while(temp>0){
            int y=temp%10;
            if(!map.containsKey(y)) map.put(y,1);
            else map.put(y,map.get(y)+1);
            temp=temp/10;
        }
        int sum=0;
        while(n>0){
            int y=n%10;
            if(!map.containsKey(y))
            {
                n=n/10;
             continue;
            }
            else {
                sum+=map.get(y)*y;
                map.remove(y);
                 n=n/10;
            }
           
        }
        return sum;
        
    }
}