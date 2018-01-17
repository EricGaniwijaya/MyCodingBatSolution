public int countClumps(int[] nums) {
  int clumps = 0;

  for(int i = 0; i < nums.length - 1; i++) {
    int j;

    for(j = i + 1; j < nums.length; j++) {
      if(nums[i] == nums[j]) {
        continue;
      } else {
        break;
      }

    }

    if(j - i > 1) {
        clumps++;
        i = j - 1;
    }
  }

  return clumps;
}
