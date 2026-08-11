class Solution {
    public boolean same(char a,char b){
          if(a=='(' && b== ')') return true;
           if(a=='[' && b== ']') return true;
            if(a=='{' && b== '}') return true;
            return false;
    }
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack <Character> st=new Stack<>();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='(' || chars[i]=='[' || chars[i]=='{'){
                st.push(chars[i]);
            }
            else{
                  if(st.isEmpty()){
                    return false;
                  }
                  char top=st.peek();
                  if(same(top,chars[i])){
                   st.pop();
                }
                else{
                    return false;
                }
            }

        }
        return st.isEmpty();
    }
}