class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
     // initialize
		int left = 0;
		int right = 1;
		int tripletCounter = 0;
		Set<Integer> hs = new HashSet<>();

		// add elements to the hashset
		for (int num : nums) {
			hs.add(num);
		}
		System.out.println("hashset: " + hs);

		// iterate through the array till the right is less than the array length and
		// left is <= right

		while (right < nums.length && left <= right) {

			if (nums[right] - nums[left] > diff) {
				// 1.when difference btwn the right pos element and left pos element is greater
				// than the diff -> move or increment the value of left
				left++;
			} else if (nums[right] - nums[left] < diff) {
				// 2.when difference btwn the right pos element and left pos element is lesser
				// than the diff -> move or increment the value of right
				right++;
			} else {
				// 3.when difference btwn the right pos element and left pos element is equal to
				// diff
				// check the value of sum of diff and right element in the hashset
				// if available the increment the counter
				if (hs.contains(nums[right] + diff)) {
					tripletCounter++;

				}

				right++;
				left++;

			}

		}

		return tripletCounter;


    }
}