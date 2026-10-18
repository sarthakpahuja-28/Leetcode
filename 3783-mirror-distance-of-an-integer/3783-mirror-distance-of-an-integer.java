class Solution {
    public int mirrorDistance(int n) {
       int o=n;
       int dup=0;
       while(n>0){
        dup=dup*10+n%10;
        n/=10;
       }       
       return Math.abs(dup-o); 
    }
}