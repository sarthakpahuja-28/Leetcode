class Solution {
    public String freqAlphabets(String s) {
        int has=-1;
        int size=s.length();
        String y="";
        for(int i=0;i<size;i++){
           
           int x =  s.substring(i,size).indexOf("#");
           if(x==-1 || x>2 ){
            int num = s.charAt(i)-'0';
            y=y+(char)('a'+num-1);
           }
           else{
               int num = Integer.parseInt(s.substring(i,i+2));
               char c = (char) ('a' + num - 1);
               y=y+c;
               i+=2;
           }
        }
        return y;
    }
}