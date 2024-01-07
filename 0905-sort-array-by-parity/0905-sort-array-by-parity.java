class Solution {
    public int[] sortArrayByParity(int[] nums) {
    int start = 0;
		int end = nums.length-1;
		while (start <= end) {
			if (nums[start] % 2 != 0 && nums[end] % 2 == 0) {
				swap(nums, start++, end--);
			} else if (nums[start] % 2 == 0) {
				start++;
			} else if (nums[end] % 2 != 0) {
				end--;
			}

		}

		return nums;

	}

	public static void swap(int[] nums, int start, int end) {
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}
}