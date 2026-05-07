class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length() ){
            return false;
        }
        Map<Character, Integer> sManager = new HashMap<>();
        Map<Character, Integer> tManager = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            sManager.put(charS, sManager.getOrDefault(charS, 0) + 1);

            char charT = t.charAt(i);
            tManager.put(charT, tManager.getOrDefault(charT, 0) + 1);
        }

        // So sánh hai map
        return sManager.equals(tManager);
        
    }
}
