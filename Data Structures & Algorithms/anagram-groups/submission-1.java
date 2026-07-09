class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> returnedList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if (map.containsKey(sorted)) {
                returnedList.get(map.get(sorted)).add(s);
            } else {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                returnedList.add(newGroup);
                
                map.put(sorted, returnedList.size() - 1);
            }
        }
        return returnedList;
    }
}