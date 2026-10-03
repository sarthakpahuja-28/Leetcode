class Solution {
    public String[] findWords(String[] words) {
        HashSet <Character> set1=new HashSet<>();
        HashSet <Character> set2=new HashSet<>();
        HashSet <Character> set3=new HashSet<>();
        ArrayList <String> list =new ArrayList<>();
        String str1="qwertyuiop";
        String str2="asdfghjkl";
        String str3="zxcvbnm";
        for(int i=0;i<10;i++){
           if(i<=9){
            set1.add(str1.charAt(i));
           }
           if(i<=8){
            set2.add(str2.charAt(i));
           }
           if(i<7){
            set3.add(str3.charAt(i));
           }
        }
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            words[i]=words[i].toLowerCase();
            String checker="";
            boolean isflag=true;
            if(set1.contains(words[i].charAt(0))) checker="set1";
            else if(set2.contains(words[i].charAt(0))) checker="set2";
            else checker="set3";
            for(int j=1;j<words[i].length();j++){
                if(checker.equals("set1")){
                    if(!set1.contains(words[i].charAt(j))){
                       isflag=false;
                        break;
                    }
                    
                }
                else if(checker.equals("set2")){
                    if(!set2.contains(words[i].charAt(j))){
                            isflag=false;
                            break;
                    }
                    
                }
               else{
                    if(!set3.contains(words[i].charAt(j))){
                         isflag=false;
                        break;
                    }
                }
            }
           if(isflag) list.add(temp);
        }
        String [] arr = new String [list.size()];
        int count=0;
        for(String i : list){
            arr[count]=i;
            count++;
        }
        return arr;
    }
}