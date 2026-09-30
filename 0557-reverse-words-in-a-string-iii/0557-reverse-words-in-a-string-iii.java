class Solution {
    public String reverse(String s){
        char [] arr =s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String x=new String(arr);
        return x;
    }
    public String reverseWords(String s) {
        String [] arr =s.split(" ");
        for(int i=0;i<arr.length;i++){
           arr[i]=reverse(arr[i]);
        }
        String x = String.join(" ", arr);
        return x;
    }
}