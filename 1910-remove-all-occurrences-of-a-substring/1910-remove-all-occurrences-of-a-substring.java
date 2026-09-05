class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>0){
           int i = sb.indexOf(part);
           if(i>=0){
            sb.delete(i,i+part.length());
           }
           else{
            break;
           }
        }
        String x=sb.toString();
        return x;
        
    }
}