vpublic boolean no23(int[] nums) {
  for (int num: nums) {
    if (num == 2 || num == 3) {
      return false;
    }
  }

  return true;
}
