class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int [] arr2=new int[arr.length];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2);
        HashMap<Integer,Integer>map=new HashMap<>();
        int rank=0;
        for(int i=0;i<arr2.length;i++){
            if(i==0 || arr2[i]>arr2[i-1]){
                rank++;
                map.put(arr2[i],rank);
            }
            map.put(arr2[i],rank); 
        }
        int [] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
        
    }
}