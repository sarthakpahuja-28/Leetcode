class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String y = s1 + " " + s2;
        String[] arr = y.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

   
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                answer.add(entry.getKey());
            }
        }

        return answer.toArray(new String[0]);
    }
}