public int[] zeroMax(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
      int largestOdd = 0;
      
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] % 2 == 1 && largestOdd < nums[j]) {
          largestOdd = nums[j];
        }
      }
      
      nums[i] = largestOdd;
    }
  }
  
  return nums;
}
