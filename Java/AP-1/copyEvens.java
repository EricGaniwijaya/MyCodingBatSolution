public int[] copyEvens(int[] nums, int count) {
  int[] arr = new int[count];
  int temp = 0;

  for(int i = 0; i < nums.length && temp < count; i++) {
    if(nums[i] % 2 == 0) {
      arr[temp++] = nums[i];
    }
  }

  return arr;
}
