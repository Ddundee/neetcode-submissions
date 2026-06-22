class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) set.add(i);

        int max = 0;
        for(int i: set) {
            if (set.contains(i - 1)) continue;
            
            int len = 1;
            while(set.contains(i + len)) len++;

            if (len > max) max = len;
        }

        return max;
    }
}
