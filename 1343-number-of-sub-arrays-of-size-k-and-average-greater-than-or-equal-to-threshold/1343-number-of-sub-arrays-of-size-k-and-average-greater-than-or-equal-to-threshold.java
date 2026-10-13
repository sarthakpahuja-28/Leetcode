class Solution {
 
    public int numOfSubarrays(int[] arr, int k, int t) {
        int x=0;
        for(int i=0;i<k;i++){
            x+=arr[i];
        }
        int count=0;
        if((x/k)>=t) count++;
        for(int i=k;i<arr.length;i++){
            x=x+arr[i]-arr[i-k];
            if((x/k)>=t) count++;
        }
        return count;
       
    }
}