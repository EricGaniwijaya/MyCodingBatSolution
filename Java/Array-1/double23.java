public boolean double23(int[] nums) {
  int count2 = 0;
  int count3 = 0;

  for (int num: nums) {
    if (num == 2) {
      count2++;
      continue;
    }

    if (num == 3) {
      count3++;
      continue;
    }
  }

  return (count2 == 2 || count3 == 2);
}
