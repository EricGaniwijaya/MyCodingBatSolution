public boolean splitOdd10(int[] nums) {
  return splitOdd10Helper(nums, 0, 0, 0);
}

public boolean splitOdd10Helper(int[] nums, int multiple, int odd, int index) {
  if(index >= nums.length) {
    return multiple % 10 == 0 && odd % 2 == 1;
  } else {
    return splitOdd10Helper(nums, multiple + nums[index], odd, index + 1) || splitOdd10Helper(nums, multiple, odd + nums[index], index + 1);
  }
}
