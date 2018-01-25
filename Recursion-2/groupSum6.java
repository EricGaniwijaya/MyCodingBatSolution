public boolean groupSum6(int start, int[] nums, int target) {
  if(start >= nums.length) {
     if(target == 0) {
      return true;
    }

    return false;
  }

  if(nums[start] == 6) {
    return groupSum6(start + 1, nums, target - nums[start]);
  }

  return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);

}
