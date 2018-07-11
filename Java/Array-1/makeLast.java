public int[] makeLast(int[] nums) {
  int[] arr = new int[nums.length * 2];

  arr[nums.length * 2 - 1] = nums[nums.length - 1];

  return arr;
}
