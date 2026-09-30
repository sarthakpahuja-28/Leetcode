
class Solution {
    public  boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        Stack <Character> st=new Stack<>();
        int size = s.length();
        for(int i=0;i<size;i++){
            char a=s.charAt(i);
            if(isVowel(a)){
            st.push(a);
            }
        }
        String x = "";
        for(int i=0;i<size;i++){
            char a=s.charAt(i);
            if(isVowel(a)){
                x=x+st.pop();
            }
            else{
                x=x+a;
            }
        }
        return x;
   }
}