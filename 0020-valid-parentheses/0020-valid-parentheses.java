class Solution {
    public static boolean checker(char a,Stack <Character> st){
        if(st.isEmpty()) return false;
        else if(a==']'){
            if(st.peek() == '[') return true;
            else return false;
        }
        else if(a==')'){
            if(st.peek()=='(') return true;
            else return false;
        }
        else if(a=='}'){
            if(st.peek()=='{') return true;
            else return false;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack <Character> st =new Stack <> ();
        if(s.length()%2!=0) return false;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='{' || a=='(' || a== '['){
                st.push(a);
            }
            else{
                if(checker(a,st)){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
}