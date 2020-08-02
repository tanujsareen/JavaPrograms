package in.test.javaprogram.array;

public class ArrayQues {

	public ArrayQues() {
		System.out.println("ArrayQues");
	}

	/*
	 * 35. Search Insert Position
	 * 
	 * Given a sorted array and a target value, return the index if the target is
	 * found. If not, return the index where it would be if it were inserted in
	 * order.
	 * 
	 * You may assume no duplicates in the array.
	 * 
	 * Example 1:
	 * 
	 * Input: [1,3,5,6], 5 Output: 2 Example 2:
	 * 
	 * Input: [1,3,5,6], 2 Output: 1 Example 3:
	 * 
	 * Input: [1,3,5,6], 7 Output: 4 Example 4:
	 * 
	 * Input: [1,3,5,6], 0 Output: 0
	 */
	public static int searchInsert(int[] nums, int target) {

		if (nums.length == 0)
			return 0;

		int found = nums.length;

		for (int i = 0; i < nums.length; i++) {

			if (target == nums[i] || target < nums[i]) {
				found = i;
				break;
			}
		}

		return found;

	}
	
	

}