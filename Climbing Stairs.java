class Solution {

    public HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public int climbStairs(int n) {
        if(n <= 1) {
            return 1;
        }
        if(cache.containsKey(n)) {
            return cache.get(n);
        }
        int recursiveCallSum = climbStairs(n-1) + climbStairs(n-2);
        cache.put(n, recursiveCallSum);
        return recursiveCallSum;
    }
}