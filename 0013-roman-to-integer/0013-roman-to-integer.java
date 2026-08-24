class Solution {
    public int romanToInt(String s) {
        HashMap <Character , Integer > map =new HashMap <> ();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char [] arr=s.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i>0 ){
                if(map.get(arr[i-1])<map.get(arr[i])){
                    sum=sum-2*map.get(arr[i-1]);
                }
                
            }
            sum=sum+map.get(arr[i]);
            
        }
        return sum;

    }
}