public boolean splitArray(int[] nums) {
  return splitArrayHelper(nums, 0, 0, 0);
}

public boolean splitArrayHelper(int[] nums, int group1, int group2, int index) {
  if(index == nums.length) {
    return group1 == group2;
  } else {
      return splitArrayHelper(nums, group1 + nums[index], group2, index + 1) || splitArrayHelper(nums, group1, group2 + nums[index], index + 1);
  }
}
