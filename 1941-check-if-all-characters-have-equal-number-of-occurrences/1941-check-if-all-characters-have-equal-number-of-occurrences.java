class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                map.put(a,map.get(a)+1);
            }
        }
        int count=0;
        for(int i=0;i<s.length();i++){
             char a=s.charAt(i);
            if(count==0){
                count=map.get(a);
            }
            else{
                if(map.get(a)!=count) return false;
            }
        }
        return true;
        
    }
}