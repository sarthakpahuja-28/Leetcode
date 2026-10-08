class Solution {
    public String customSortString(String order, String s) {
        HashMap <Character,Integer> map = new HashMap<>();
        int size=s.length();
        for(int i=0;i<size;i++){
            char a=s.charAt(i);
            if(!map.containsKey(a)) map.put(a,1);
            else map.put(a,map.get(a)+1);
        }
        int osize=order.length();
        String y="";
        for(int i=0;i<osize;i++){
             char a=order.charAt(i);
            if(map.containsKey(a)){
                String x=""+a;
                y=y+x.repeat(map.get(a));
                map.remove(a);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            char x=entry.getKey();
            String z=""+x;
            y=y+z.repeat(entry.getValue());
        }
        return y;
    }
}