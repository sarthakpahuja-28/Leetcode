class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] result=new int [arr1.length];
        HashMap <Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                 map.put(arr1[i],1);
            }
            else{
                map.put(arr1[i],map.get(arr1[i])+1);
            }
        }
        int count=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<map.get(arr2[i]);j++){
                result[count]=arr2[i];
                count++;
            }
           map.remove(arr2[i]);
            
        }
        
        ArrayList<Integer> remaining = new ArrayList<>();

        for (int key : map.keySet()) {
            for (int j = 0; j < map.get(key); j++) {
                remaining.add(key);
            }
        }

        Collections.sort(remaining);

  
        for (int i = 0; i < remaining.size(); i++) {
            result[count] = remaining.get(i);
            count++;
        }
        return result;
        
    }
}