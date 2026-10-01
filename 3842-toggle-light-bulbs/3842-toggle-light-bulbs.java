class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        // HashMap<Integer,Integer> map =new HashMap<>();
        ArrayList <Integer> list =new ArrayList<>();
        int [] freq= new int [101];
        for(int i : bulbs){
            // if(!map.containsKey(i)){
            //     map.put(i,1);
            // }
            // else{
            //     map.put(i,map.get(i)+1);
            // }
            freq[i]++;
        }
        for(int i=1;i<101;i++){
            if(freq[i]%2!=0){
                list.add(i);
            }
        }
        // Collections.sort(list);
        return list;

        
    }
}