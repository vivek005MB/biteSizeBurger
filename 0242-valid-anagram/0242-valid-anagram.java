class Solution {
    public boolean isAnagram(String s, String t) {
        return sortingMethod(s, t); // o(nlogn)     O(n)
        // return hashmapMethod(s, t);
        
        
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