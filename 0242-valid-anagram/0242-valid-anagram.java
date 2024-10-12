class Solution {
    public boolean isAnagram(String s, String t) {
          Map<Character, Integer> sm =new HashMap <>();
        Map<Character, Integer> tm =new HashMap<>();
        if (s.length() == t.length()) {

            for (int i = 0; i < s.length(); i++) {
                char stmp = s.charAt(i);
                char ttmp = t.charAt(i);
                int tempSInt = sm.getOrDefault(stmp, 0) + 1;
                int tempTInt = tm.getOrDefault(ttmp, 0) + 1;
                sm.put(stmp, tempSInt);
                tm.put(ttmp, tempTInt);
            }
        } else {
            return false;
        }

      return  sm.equals(tm);
    }
}