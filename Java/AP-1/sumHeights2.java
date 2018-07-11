public int sumHeights2(int[] heights, int start, int end) {
  int sum = 0;

  for (int i = start; i < end; i++) {
    if (heights[i + 1] > heights[i]) {
      sum += (heights[i + 1] - heights[i]) * 2;
    } else {
      sum += heights[i] - heights[i + 1];
    }
  }

  return sum;
}
