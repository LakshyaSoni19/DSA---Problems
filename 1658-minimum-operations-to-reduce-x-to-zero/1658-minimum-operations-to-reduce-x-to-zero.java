class Solution {
    public int minOperations(int[] nums, int x) {
            int totalSum = 0;

        for (int number : nums) {
            totalSum += number;
        }

        int targetSum = totalSum - x;

        // Agar target negative hai
        if (targetSum < 0) {
            return -1;
        }

        int left = 0;
        int currentSum = 0;
        int longestSubarrayLength = -1;

        for (int right = 0; right < nums.length; right++) {

            currentSum += nums[right];

            while (currentSum > targetSum && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == targetSum) {
                longestSubarrayLength =
                    Math.max(longestSubarrayLength, right - left + 1);
            }
        }

        if (longestSubarrayLength == -1) {
            return -1;
        }

        return nums.length - longestSubarrayLength;
    }
}