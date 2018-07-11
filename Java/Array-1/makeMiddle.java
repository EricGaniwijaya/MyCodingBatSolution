public int[] makeMiddle(int[] nums) {
  return Arrays.copyOfRange(nums, nums.length/2 - 1, nums.length/2 + 1);
}