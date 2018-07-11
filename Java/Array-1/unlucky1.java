public boolean unlucky1(int[] nums) {
  for (int i = 0, j = nums.length - 1; i + 1 < 3 && j - 1 >= 0; i++) {
    if (nums[i] == 1 && nums[i + 1] == 3) {
      return true;
    }
    
    if (nums[j - 1] == 1 && nums[j] == 3) {
      return true;
    }
  }

  return false;
}
