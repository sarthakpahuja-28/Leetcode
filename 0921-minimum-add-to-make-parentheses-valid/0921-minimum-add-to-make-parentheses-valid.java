class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> st=new Stack<>();
        int count=0;
        int size=s.length();
        for(int i=0;i<size;i++){
            char a=s.charAt(i);
            if(a=='(' ){
                st.push('(');
            }
            else if(a==')'){
                if( !st.isEmpty()) st.pop();
                else count++;
            }
        }
        return st.size()+count;
    }
}