class Solution {
    public int months(int a){
        switch(a){
            case 1:
            return 31;
            case 2:
            return 28;
            case 3:
            return 31;
             case 4:
            return 30;
             case 5:
            return 31;
             case 6:
            return 30;
             case 7:
            return 31;
             case 8:
            return 31;
             case 9:
            return 30;
             case 10:
            return 31;
             case 11:
            return 30;
             case 12:
            return 31;

        }
        return 0;
    }
    public int dayOfYear(String date) {
        String y=date.substring(0,4);
        int year=Integer.parseInt(y);
        String m=date.substring(5,7);
        int month=Integer.parseInt(m);
        String d=date.substring(8);
        int dat=Integer.parseInt(d);
        int sum=0;
        for(int i=1;i<month;i++){
             if(i==2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
                sum=sum+29;
             }
             else{
                sum=sum+months(i);
             }
        }
        return sum+dat;
    }
}