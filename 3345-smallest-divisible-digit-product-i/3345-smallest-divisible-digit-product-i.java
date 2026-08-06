class Solution {
    public int smallestNumber(int n, int t) {
        int sum=1;
         for(int i=0;i<10;i++){
            sum=1;
            int x=n;
            while(n>0){
                sum=sum*(n%10);
                n=n/10;
            }
            if(sum%t==0){
               return x;
            }
            else{
                n=x+1;
            }
         }
         return sum;
       
    }
}