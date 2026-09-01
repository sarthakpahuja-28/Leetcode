class Solution {
    public boolean checkIfPangram(String sentence) {
        int [] arr=new int [26];
        int count=0;
        for(int i=0;i<sentence.length();i++){
              int x=sentence.charAt(i)-'a';
              if(arr[x]==0){
                arr[x]=arr[x]+1;
                count=count+1;
              }
             
        }
        if(count==26){
            return true;
        }
       return false;
    }
}