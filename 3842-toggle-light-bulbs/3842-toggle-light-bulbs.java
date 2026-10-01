class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashMap<Integer,Integer> map =new HashMap<>();
        ArrayList <Integer> list =new ArrayList<>();
        for(int i : bulbs){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        for(Integer key : map.keySet()){
            if(map.get(key)%2!=0){
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;

        
    }
}