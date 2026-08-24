class Solution {
    public char findTheDifference(String s, String t) {
        HashMap <Character,Integer> map=new HashMap <> ();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(!map.containsKey(a)){
                map.put(a,1);
            }
            else{
                map.put(a,map.get(a)+1);
            }
        } 
        for(int i=0;i<t.length();i++){
            char a=t.charAt(i);
            if(!map.containsKey(a)){
                return a;
            }
            if(map.get(a)==0){
                return a;
            }
            else{
                map.put(a,map.get(a)-1);
            }
        }
        return 'a';
    }
}