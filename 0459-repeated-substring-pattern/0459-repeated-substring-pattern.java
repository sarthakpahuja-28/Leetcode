class Solution {
    public boolean repeatedSubstringPattern(String s) {
        // if(s.length()%2!=0) return false;
        // String x=s.substring(0,s.length()/2);
        // String y=s.substring(s.length()/2,s.length());
        // if(x.equals(y)){
        //     return true;
        // }
        // else{
        //     return false;
        // }
      return (s + s).substring(1, 2 * s.length() - 1).contains(s);
        
    }
}