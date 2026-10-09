class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>list =new ArrayList<>();
        // list.add(left);
        for(int i=left;i<=right;i++){
            String x=""+i;
            if(i<10)list.add(i);
            else if(x.indexOf('0')<0){
                int temp=i;
                boolean isFlag=true;
                while(temp>0){

                    if(!(i%(temp%10)==0)){ 
                        isFlag=false;
                        break;
                    }
                    temp=temp/10;
                }
                if(isFlag) list.add(i);
            }
        }
        return list;
    }
}