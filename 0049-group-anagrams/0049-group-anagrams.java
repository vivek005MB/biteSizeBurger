import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int n = strs.length;
        if (n == 0) return ans;
        HashMap<String, List<String>> map = new HashMap<>();

        for (String currentString : strs) {
            int[] arr = new int[26];
            Arrays.fill(arr, 0);
            for (char ch : currentString.toCharArray()) {
                arr[ch - 'a']++;
            }
            String key = Arrays.toString(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(currentString);
        }
        ans.addAll(map.values());
        return ans;
    }
}
