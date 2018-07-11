public int[] seriesUp(int n) {
  int[] series = new int[n*(n+1)/2];
  int index = 0;

  for(int i = 0; i < n; i++) {
    for(int j = 0; j < i + 1; j++) {
      series[index++] = j + 1;
    }
  }

  return series;
}
