class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] arr ={
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        HashSet <String> set = new HashSet<>();
        String [] arr2=new String[words.length];
        for(int i=0;i<words.length;i++){
            String y="";
            for(int j=0;j<words[i].length();j++){
                  char a=words[i].charAt(j);
                  int x=a-'a';
                  y=y+arr[x];
            }
            arr2[i]=y;
        }
        for(int i=0;i<words.length;i++){
            set.add(arr2[i]);
        }
        return set.size();
    }
}