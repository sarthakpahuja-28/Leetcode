class Solution {
    public int[] shortestToChar(String s, char c) {
        int [] arr= new int [s.length()];
        for(int i=0;i<s.length();i++){
            int x=s.substring(0,i).lastIndexOf(c);
            int y=s.substring(i).indexOf(c);
            if(i-x<y && x!=-1 || y==-1){
                arr[i]=i-x;
            }
            else arr[i]=y;
        }
        return arr;
        
    }
}