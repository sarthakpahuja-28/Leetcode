class Solution {
    public String month(String a){
        switch(a){
            case "Jan":
            return "01";
            case "Feb":
            return "02";
            case "Mar":
            return "03";
            case "Apr":
            return "04";
            case "May":
            return "05";
            case "Jun":
            return "06";
            case "Jul":
            return "07";
            case "Aug":
            return "08";
            case "Sep":
            return "09";
            case "Oct":
            return "10";
            case "Nov":
            return "11";
            case "Dec":
            return "12";
        }
        return "";
    }
    public String reformatDate(String s) {
        int a=0;
        String x="";
        String y="";
        if(s.length()==12){
            a=s.charAt(0)-'0';
            x=s.substring(4,7);
            y=s.substring(8);
        }
        else {
            a=Integer.parseInt(s.substring(0,2));
            x=s.substring(5,8);
            y=s.substring(9);
        }
        String b=month(x);
        String z="";
        if(a>9 ){
           z = y+"-"+b+"-"+a;
        }
        else{
            z = y+"-"+b+"-0"+a;
        }
        return z;
    }
}