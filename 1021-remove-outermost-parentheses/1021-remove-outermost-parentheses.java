class Solution {
    public String removeOuterParentheses(String s) {
        int size=s.length();
        int depth=0;
        int idx=-1;
        String y="";
        for(int i=0;i<size;i++){
           char a=s.charAt(i);
           if(a=='(' && depth==0) idx=i;
           if(a=='(') depth++;
           else if(a==')')depth--;
           if(depth==0) y+=s.substring(idx+1,i);
        }
        return y;
      
    }
}