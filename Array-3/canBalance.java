public boolean canBalance(int[] nums) {
  int sumLeft = 0;
  int sumRight = 0;

  for(int i = 0; i < nums.length - 1; i++) {
    sumLeft += nums[i];
    for(int j = nums.length-1; j != i; j--) {
      sumRight += nums[j];
    }

    if(sumLeft == sumRight) {
      return true;
    }

    sumRight = 0;
  }

  return false;
}
