class Solution {
    public boolean checker(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int x=0;
        for(int i=0;i<k;i++){
            char a=s.charAt(i);
            if(checker(a)) x++;
        }
        int max=x;
        for(int i=k;i<s.length();i++){
            char a=s.charAt(i-k);
            if(checker(a)){
                x--;
                char b=s.charAt(i);
                if(checker(b)) x++;
            }
            else{
                char b=s.charAt(i);
                if(checker(b)) x++;
            }
            if(x>max) max=x;
        }
        return max;
    }
}