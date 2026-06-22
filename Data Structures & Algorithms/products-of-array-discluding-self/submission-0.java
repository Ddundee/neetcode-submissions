class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prods = new int[nums.length];

        for(int i = 0, p = 1; i < nums.length; i++) {
            prods[i] = p;
            p *= nums[i];
        }

        for(int i = nums.length - 1, p = 1; i >= 0; i--) {
            prods[i] *= p;
            p *= nums[i];
        }

        return prods;
    }
}  
