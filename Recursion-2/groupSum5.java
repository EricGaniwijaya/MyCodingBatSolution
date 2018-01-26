public boolean groupSum5(int start, int[] nums, int target) {
    if(start >= nums.length) {
        return target == 0;
    }

    if(nums[start] == 1 && start > 0 && nums[start-1] % 5 == 0) {
      return groupSum5(start+1, nums, target);
    }

    if(nums[start] % 5 == 0) {
        return groupSum5(start+1, nums, target-nums[start]);
    }

    return groupSum5(start+1, nums, target) || groupSum5(start+1, nums, target-nums[start]);
}
