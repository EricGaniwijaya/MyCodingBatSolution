public int sum2(int[] nums) {
  int sum = 0;

  for(int i = 0; i < nums.length; i++) {
    if(i == 2) {
      break;
    }

    sum += nums[i];
  }

  return sum;
}
