class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            char a=text.charAt(i);
            if(!map.containsKey(a)){
                 map.put(a,1);
            }
            else{
                map.put(a,map.get(a)+1);
            }
        }
         int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}