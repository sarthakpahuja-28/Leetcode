class Solution {
    public boolean checkString(String s) {
        int idx=s.lastIndexOf('a');
        int idx2=s.indexOf('b');
        if(idx<idx2 || idx2==-1){
            return true;
        }
        return false;
        
    }
}