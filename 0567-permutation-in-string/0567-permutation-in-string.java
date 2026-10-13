class Solution {
    public boolean check(String x,String s1){
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
        // StringBuilder sb=new StringBuilder("");
        // for(int i=0;i<size;i++){
        //      sb.append(s1.charAt(i));
        // }
        // String y=sb.toString();
        // if(check(y,s1)) return true;
        String y="";
        for(int i=0;i<=size2-size;i++){
              y=s2.substring(i,i+size);
              if(check(y,s1)) return true;
        }
        return false;


        
    }
}