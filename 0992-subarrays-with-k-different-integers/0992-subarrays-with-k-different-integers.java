class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subArrayK(nums, k) - subArrayK(nums, k - 1);
    }

    public int subArrayK(int[] nums, int k){
        if(k == 0){
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<>();

        int left = 0, right = 0, ans = 0;

        for(right = 0; right < nums.length; right++){
            map.put(nums[right], map.getOrDefault(nums[right] , 0) + 1);
            while(map.size() > k){
                int rem = nums[left];
                map.put(rem, map.get(rem) - 1);

                if(map.get(rem) == 0){
                    map.remove(rem);
                }
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}