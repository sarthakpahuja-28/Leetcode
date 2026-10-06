class Solution {
    public String restoreString(String s, int[] indices) {
        char [] arr=new char[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[indices[i]]=s.charAt(i);
        }
        String x=new String(arr);
        return x;
        
    }
}