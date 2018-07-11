public int[] tenRun(int[] nums) {
  int currentTen = -1;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 10 != 0 && currentTen != -1) {
      nums[i] = currentTen;
    } else if (nums[i] % 10 == 0) {
      currentTen = nums[i];
    }
  }
  
  return nums;
}
