class Solution {
    public String defangIPaddr(String address) {
        // String x="";
        // for(int i=0;i<address.length();i++){
        //     char a=address.charAt(i);
        //     if(a!='.'){
        //        x+=a;
        //     }
        //     else x+="[.]";
        // }
        // return x;
        return address.replace(".","[.]");
    }
    
}