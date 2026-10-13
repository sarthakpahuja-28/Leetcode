class Solution {
    public boolean check(StringBuilder sb,String s1){
        String x=sb.toString();
      char [] arr1=x.toCharArray();
      char [] arr2=s1.toCharArray();
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      for(int i=0;i<arr1.length;i++){
        if(arr1[i]!=arr2[i]) return false;
      }
      return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int size=s1.length();
        int size2=s2.length();
        if(size2<size)return false;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<size;i++){
             sb.append(s2.charAt(i));
        }
        // String y=sb.toString();
        if(check(sb,s1)) return true;
        for(int i=0;i<size2-size;i++){
            sb.deleteCharAt(0);
            sb.append(s2.charAt(i+size));
            if(check(sb,s1)) return true;
        }
        return false;


        
    }
}