class Solution {
    public int findLucky(int[] arr) {
        HashMap <Integer,Integer> map =new HashMap <> () ;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],1);
            else map.put(arr[i],map.get(arr[i])+1);
        }
        Arrays.sort(arr);
        int x=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)continue;
            if(map.get(arr[i])==arr[i]) x=arr[i];
        }
        return x;
    }
}