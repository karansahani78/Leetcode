import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        // Step 1: Process each word
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];  // take the word

            // convert word to char array so we can sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            // make a new string from sorted chars (this will be the key)
            String key = new String(chars);

            // if key is not in map, put new empty list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }

            // add the word into the correct list
            map.get(key).add(word);
        }

        // Step 2: Convert map values into result list
        List<List<String>> result = new ArrayList<>();
        List<String> keys = new ArrayList<>(map.keySet()); // all keys in a list

        for (int i = 0; i < keys.size(); i++) {
            result.add(map.get(keys.get(i)));
        }

        return result;
    }
}
