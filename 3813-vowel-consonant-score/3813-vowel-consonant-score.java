class Solution {
    public boolean checker(char a){
        if(a=='a' || a== 'e'|| a== 'i' || a== 'o' || a== 'u'  ) return true;
        return false;
    }
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if((a>='a' && a<='z') || (a>='A' && a<='z')){
                if(checker(a))v++;
                else c++;
            }
        }
        if(c==0) return 0;
        return (int)Math.floor(v/c);
        
    }
}