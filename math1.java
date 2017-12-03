public List<Integer> math1(List<Integer> nums) {
  nums.replaceAll(number -> (number + 1) * 10);

  return nums;
}
