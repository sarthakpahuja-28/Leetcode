class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String x=sb.toString();
        String res = x.replaceAll("[^a-zA-Z]", "");
        char [] arr=s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(Character.isAlphabetic(arr[i])){
                arr[i]=res.charAt(count);
                count++;
            }
        }
        String y=new String(arr);
        return y;
        
    }
}