class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String y = s1+" "+s2;
        String [] arr=y.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList <String> list = new ArrayList <> ();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                 map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                list.add(arr[i]);
            }
        }
        String [] arr1 = new String [list.size()];
        int count=0;
        for(String x : list ){
             arr1[count] = x;
             count++;
        }
       return arr1;

    }
}