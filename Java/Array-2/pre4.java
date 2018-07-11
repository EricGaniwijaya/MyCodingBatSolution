public int[] pre4(int[] nums) {
  int count = 0;
  
  for (int num: nums) {
    if (num != 4) {
      count++;
    } else {
      break;
    }
  }
  
  return Arrays.copyOfRange(nums, 0, count);
}
