class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(right = 0; right < size; right++){
            sum += nums[right];
            while(sum >= target){
                ans = Math.min(right-left + 1, ans);
                sum -= nums[left];
                left++;
            }
        }

        if(ans == Integer.MAX_VALUE){
            return 0;
        }


        return ans;


        
    }
}