class Solution {
    public int largestAltitude(int[] gain) {
        int [] pref =new int[gain.length+1];
        pref[0]=0;
        pref[1]=gain[0];
        for(int i=1;i<gain.length;i++){
            pref[i+1]=pref[i]+gain[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<pref.length;i++){
            if(pref[i]>max) max=pref[i];
        }
        return max;
        
    }
}