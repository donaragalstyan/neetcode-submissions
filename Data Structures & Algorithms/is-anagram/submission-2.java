class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        for (char charS : s.toCharArray()) {
            if (mapS.containsKey(charS)) {
                mapS.put(charS, mapS.get(charS) + 1);
            } else {
                mapS.put(charS, 1);
            }
        }

        for (char charT : t.toCharArray()) {
            if (mapT.containsKey(charT)) {
                mapT.put(charT, mapT.get(charT) + 1);
            } else {
                mapT.put(charT, 1);
            }
        }

        return mapS.equals(mapT);
    }
}
