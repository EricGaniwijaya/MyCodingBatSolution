public int maxTriple(int[] nums) {
  int max = 0;
  int a = nums[0];
  int c = nums[nums.length - 1];
  int b = nums[nums.length/2];
  
  if (a > b) {
    max = a;
  } else {
    max = b;
  }
  
  return max > c ? max : c;
}
