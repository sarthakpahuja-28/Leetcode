class Solution {
    public int maxDepth(String s) {
        int max=0;
        // Stack <Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            // if(st.isEmpty()){
            //     count=0;
            // }
            if(a=='('){
                // st.push(a);
                count++;
                if(count>max){
                    max=count;
                }
            }
            else if(a==')'){
                count--;
            }
        }
        if(max==-1) return 0;
        return max;
        
    }
}