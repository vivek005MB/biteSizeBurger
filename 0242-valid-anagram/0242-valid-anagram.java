class Solution {
    public boolean isAnagram(String s, String t) {
        // return sortingMethod(s, t); // o(nlogn)     O(n)
        // return hashmapMethod(s, t);
        return countarray(s,t);
        
        
    }
    public boolean countarray(String s, String t)
    {
        int[] arr1 = new int[26];
        for(char ch:s.toCharArray())
        {
            arr1[ch-'a']++;
        }
        int[] arr2 = new int[26];
        for(char ch:t.toCharArray())
        {
            arr2[ch-'a']++;
        }
        for(int i = 0; i <26; i++)
        {
            if(arr1[i] != arr2[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean hashmapMethod(String s, String t)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch: s.toCharArray())
        {
            int f = map.getOrDefault(ch,0);
            f++;
            map.put(ch, f);
            
        }
        
        for(Character ch: t.toCharArray())
        {
            // check if ch is in map or not
            int f = map.getOrDefault(ch,0);
            if(f == 0)return false;
            else f--;
            if(f == 0) map.remove(ch);
            else map.put(ch, f);
        }
        if(map.isEmpty()){
            return true;
        }
        return false;
    }
    public boolean sortingMethod(String s, String t)
    {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length != arr2.length) return false;
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] != arr2[i])return false;
        }
        return true;
    }
}