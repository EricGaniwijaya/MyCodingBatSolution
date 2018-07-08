public int[] zeroFront(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      for (int j = 0; j < i; j++) {
        if (nums[j] != 0) {
          int temp = nums[j];
          nums[j] = nums[i];
          nums[i] = temp;
        }
      }
    }
  }
  
  return nums;
}
