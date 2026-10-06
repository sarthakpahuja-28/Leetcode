class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char a= s.charAt(i);
            if(!st.isEmpty() && st.peek()==a )st.pop();
            else st.push(a);

        }
        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}