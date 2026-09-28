class Solution {
    public int maxDepth(String s) {
        int max=-1;
        Stack <Character> st=new Stack<>();
        // int count=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            // if(st.isEmpty()){
            //     count=0;
            // }
            if(a=='('){
                st.push(a);
                
                if(st.size()>max){
                    max=st.size();
                }
            }
            else if(a==')'){
                st.pop();
            }
        }
        if(max==-1) return 0;
        return max;
        
    }
}