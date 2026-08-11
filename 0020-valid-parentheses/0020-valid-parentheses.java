class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='(' || a=='{' || a=='['){
                  st.push(a);
            }
            else{ 
                if(st.isEmpty()){
                    return false;
                }
               if(a==')'){
                   if(st.peek()!='('){
                    return false;
                   }
               }
               else if(a=='}'){
                   if(st.peek()!='{'){
                    return false;
                   }
               }
            else if(a==']'){
                   if(st.peek()!='['){
                    return false;
                   }
               }
               st.pop();
            }
        }
        if(st.isEmpty())
        return true;
        else
        return false;
    }
}