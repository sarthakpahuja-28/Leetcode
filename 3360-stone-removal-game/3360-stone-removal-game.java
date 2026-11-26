class Solution {
    public boolean game(int n,boolean s,int count){
        if(s){
            if((n-count)<0){
                return false;
                }

            if((count-n)==0) {return true;}
            else {return game(n-count,false,count-1);}
        }
        else{
            if((n-count)==0) {return false;}
            if((n-count)<0) {return true;}
            
            else {return game(n-count,true,count-1);}
        }
        // return true;
    }
    public boolean canAliceWin(int n) {
      return   game(n,true,10);
    }
}