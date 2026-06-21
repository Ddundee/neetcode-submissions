class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean answer = false;
            for(int i = 0; i < nums.length; i++){
                int check = nums[i];
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] == nums[i]){
                        answer = true;
                    }
                }
            }
            return answer;
    }
}
