class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String [] arr= paragraph.trim().split("\\s+");
        HashMap <String,Integer> map = new HashMap<>();
        HashSet <String> set = new HashSet<>();
        for(int i=0;i<banned.length;i++){
            set.add(banned[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i]) && !set.contains(arr[i]) ){
                map.put(arr[i],1);
            }
            else if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        
        int max=-1;
        String x="";
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                if(map.get(arr[i])>max){
                    max=map.get(arr[i]);
                    x=arr[i];
                }
            }
        }
        return x;
        
    }
}