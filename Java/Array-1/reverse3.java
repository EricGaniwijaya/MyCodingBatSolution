public int[] reverse3(int[] nums) {
  int[] reverse = new int[nums.length];

  for(int i = nums.length - 1; i >= 0; i--) {
    reverse[(nums.length - 1) - i] = nums[i];
  }

  return reverse;
}
