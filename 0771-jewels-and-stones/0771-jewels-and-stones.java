class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap < Character,Integer> map =new HashMap <> ();
        for(int i=0;i<stones.length();i++){
            char a=stones.charAt(i);
            if(!map.containsKey(a)){
                 map.put(a,1);
            }
            else{
               map.put(a, map.get(a)+1);
            }
        }
        int sum=0;
        for(int i=0;i<jewels.length();i++){
            char a=jewels.charAt(i);
            if(map.containsKey(a)){
                sum=sum+map.get(a);
            }
        }
        return sum;
        
    }
}