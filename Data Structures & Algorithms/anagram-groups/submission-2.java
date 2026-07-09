class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] sorted = new String[strs.length];
        HashMap<String, ArrayList<String>> m = new HashMap<>();
        for (int i = 0; i < strs.length; ++i) {
            char[] sortedString = strs[i].toCharArray();
            Arrays.sort(sortedString);
            String sortedKey = new String(sortedString);
            sorted[i] = sortedKey;
            if(m.containsKey(sortedKey)) {
                m.get(sortedKey).add(strs[i]);
            } else {
                ArrayList<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                m.put(sortedKey, newList);
            }
        }

        return new ArrayList<>(m.values());

        
        
        
    }
}