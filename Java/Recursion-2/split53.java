public boolean split53(int[] nums) {
  return split53Helper(nums, 0, 0, 0);
}

public boolean split53Helper(int[] nums, int multiple5, int multiple3, int index) {
  if(index >= nums.length) {
    return multiple5 == multiple3;
  } else {
    if (nums[index] % 5 == 0) {
      return split53Helper(nums, multiple5 + nums[index], multiple3, index + 1);
    } else if(nums[index] % 3 == 0) {
      return split53Helper(nums, multiple5, multiple3 + nums[index], index + 1);
    } else {
      return split53Helper(nums, multiple5 + nums[index], multiple3, index + 1) || split53Helper(nums, multiple5, multiple3 + nums[index], index + 1);
    }
  }
}
