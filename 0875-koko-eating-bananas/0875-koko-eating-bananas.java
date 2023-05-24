class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // T.c = N * log(1e9) = 30*N = O(N)
        int ans = 0;
        int lo = 0;
        int hi = (int)1e9;
        while(lo <= hi)
        {
            int mid = lo + (hi - lo)/2;
            if(check(piles,mid,h))
            {
                ans = mid;
                hi = mid -1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
        
    }
    public boolean check(int[] piles, int k, int h)
    {
        // this checks for current Eating rate K, if it is possible to eat
        // all the bananas within 'h' hours
        // Tc. O(N)
        int count = 0;
        for(int num: piles)
        {
            count += Math.ceil((1.0 * num )/ k);
            if(count > h)return false;
        }
        return true;
    }
}