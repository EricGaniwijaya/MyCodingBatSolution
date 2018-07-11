public int[] post4(int[] nums) {
  int last4Index = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      last4Index = i;
    }
  }
  
  return Arrays.copyOfRange(nums, last4Index + 1, nums.length);
}
