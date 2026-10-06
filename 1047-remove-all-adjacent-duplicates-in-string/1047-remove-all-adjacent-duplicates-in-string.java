class Solution {
    public String removeDuplicates(String s) {
        // Stack <Character> st= new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char a= s.charAt(i);
            int size=sb.length();
            if(size>0 && sb.charAt(size-1)==a )sb.deleteCharAt(size-1);
            else sb.append(a);

        }
        
        return sb.toString();
    }
}