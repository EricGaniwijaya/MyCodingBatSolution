public int[] withoutTen(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 10 || nums[i] == 0) {
      nums[i] = 0;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] != 10) {
          nums[i] = nums[j];
          nums[j] = 0;
          
          break;
        }
      }
    }
  }
  
  return nums;
}
