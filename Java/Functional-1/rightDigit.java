public List<Integer> rightDigit(List<Integer> nums) {
  nums.replaceAll(number -> number % 10);

  return nums;
}
