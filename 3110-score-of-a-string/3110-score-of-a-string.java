class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        int size=s.length();
        for(int i=0;i<size-1;i++){
            
            sum+=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
            
        }
        return sum;
    }
}