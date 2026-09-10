class Solution {
    public long countCommas(long n) {
       if(n<999) return 0;
       long start=1000;
       long thershold=0;
       while(start<=n){
        thershold+=n-start+1;
        start*=1000;
       }
        return thershold;
    }
}