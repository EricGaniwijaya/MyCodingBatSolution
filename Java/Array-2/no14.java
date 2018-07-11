public boolean no14(int[] nums) {
  boolean flag = false;
  boolean isChange = false;

  for (int num: nums) {
    if (num == 1) {
      flag = !flag;
      isChange = true;
      break;
    }
  }

  for (int num: nums) {
    if (num == 4) {
      flag = !flag;
      isChange = true;
      break;
    }
  }

  return isChange ? flag : true;
}
