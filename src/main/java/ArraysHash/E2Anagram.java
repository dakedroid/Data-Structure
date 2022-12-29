package ArraysHash;

import java.util.Arrays;
import java.util.HashMap;

public class E2Anagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] != tc[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {

        HashMap<Character, Integer> hs = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (hs.containsKey(s.charAt(i))) {
                hs.put(s.charAt(i), hs.get(s.charAt(i)) + 1);
            } else {
                hs.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (hs.containsKey(t.charAt(j)) && hs.get(t.charAt(j)) > 0) {
                hs.put(t.charAt(j), hs.get(t.charAt(j)) - 1);
            } else {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] alphabet = new int[26]; // a b c d f g h i j k ...

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int letter : alphabet) {
            if (letter != 0) return false;
        }

        return true;
    }


    public static void main(String[] args) {
        E2Anagram a = new E2Anagram();
        a.isAnagram3("anagram", "anagram");
    }

}
