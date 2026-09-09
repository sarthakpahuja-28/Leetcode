class Solution {
    public String common(String x, String y){
        int len=Math.min(x.length(),y.length());
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<len;i++){
            if(x.charAt(i)==y.charAt(i)){
                sb.append(x.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            res=common(res,strs[i]);
        }
        return res;
    }
}