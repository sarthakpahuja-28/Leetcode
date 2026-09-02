class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
           int [] arr=new int [26];
        int [] arr1=new int [26];
        for(int i=0;i<magazine.length();i++){
            int x=magazine.charAt(i)-'a';
            arr[x]=arr[x]+1;
        }
        
         for(int i=0;i<ransomNote.length();i++){
            int x=ransomNote.charAt(i)-'a';
            arr1[x]=arr1[x]+1;
        }
        for(int i=0;i<ransomNote.length();i++){
            int x=ransomNote.charAt(i)-'a';
            if(arr[x]<arr1[x]){
                return false;
            }
        }
        return true;       
    }
}