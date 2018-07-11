public boolean has23(int[] nums) {
  for (int num: nums) {
    if (num == 3 || num == 2) {
      return true;
    }
  }

  return false;
}
