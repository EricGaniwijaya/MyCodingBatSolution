public int sumHeights(int[] heights, int start, int end) {
  int sum = 0;

  for (int i = start; i < end; i++) {
    if (heights[i] > heights[i + 1]) {
      sum += heights[i] - heights[i + 1];
    } else {
      sum += heights[i + 1] - heights[i];
    }

  }

  return sum;
}
