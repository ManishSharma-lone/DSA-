class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int max = Integer.MAX_VALUE;
        int ans = 0;

        for(int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target) {
                    return sum;
                }

                int res = Math.abs(sum - target);

                if(res < max) {
                    max = res;
                    ans = sum;
                }

                if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return ans;
    }
}