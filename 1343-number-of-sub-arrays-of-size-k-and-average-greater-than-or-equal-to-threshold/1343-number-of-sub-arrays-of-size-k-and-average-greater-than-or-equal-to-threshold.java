class Solution {
    public boolean check(int sum,int k,int t){
        if((sum/k)>=t) return true;
        return false;
    }
    public int numOfSubarrays(int[] arr, int k, int t) {
        int x=0;
        for(int i=0;i<k;i++){
            x+=arr[i];
        }
        int count=0;
        if(check(x,k,t)) count++;
        for(int i=k;i<arr.length;i++){
            x=x+arr[i]-arr[i-k];
            if(check(x,k,t)) count++;
        }
        return count;
       
    }
}