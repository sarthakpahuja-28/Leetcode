class Solution {
    public boolean checker(char a){
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U' ) return true;
        return false;
    }
    public String toGoatLatin(String s) {
        String [] arr= s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(checker(arr[i].charAt(0))) {
               arr[i] =  arr[i]+"maa"+("a".repeat(i));
                // count++;
            }
            else{
                char b=arr[i].charAt(0);
                // arr[i]=s.substring(1,arr[i].length());
                StringBuilder sb=new StringBuilder(arr[i]);
                sb.deleteCharAt(0);
                String y = sb.toString(); 
                arr[i]=y+b+"maa"+("a".repeat(i));
            }
        }
        String x=String.join(" ",arr);
        return x;
    }
}