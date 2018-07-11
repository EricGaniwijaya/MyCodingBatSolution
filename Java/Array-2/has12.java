public boolean has12(int[] nums) {
  boolean one = false;

  for (int num: nums) {
    if (num == 1) {
      one = true;
    } else if (num == 2 && one) {
      return true;
    }
  }

  return false;
}
