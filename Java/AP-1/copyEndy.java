public int[] copyEndy(int[] nums, int count) {
  int[] endy = new int[count];
  int index = 0;

  for(int num: nums) {
    if(index == count) {
      break;
    }

    if((num >= 0 && num <= 10) || (num >= 90 && num <= 100)) {
      endy[index++] = num;
    }
  }

  return endy;
}
