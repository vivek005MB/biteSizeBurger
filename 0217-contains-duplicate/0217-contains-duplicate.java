class Solution {
    public boolean containsDuplicate(int[] nums) {
        return sortingMethod(nums); // T.C : O(n logn)
        // can also be done using hashset T.c O(n) S.c O(n)
        
    }
    public boolean sortingMethod(int[] nums)
    {
        int n = nums.length;
        if(n == 1) return false;
        Arrays.sort(nums); // nlogn
        for(int i = 1; i<n;i++)
        {
            int curr = nums[i];
            int prev = nums[i-1];
            if(curr == prev){
                return true;
            }
        }
        return false;
    }
}