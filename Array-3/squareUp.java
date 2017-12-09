public int[] squareUp(int n) {
  int[] squareUp = new int[n*n];
  int pattern = 0;

  for(int i = 0; i < n; i++) {
    pattern = i + 1;

    for(int j = n; j > 0; j--) {
      if(pattern == j) {
        squareUp[((i + 1) * n) - j] = j;
        pattern--;
      } else {
        squareUp[((i + 1) * n) - j] = 0;
      }
    }
  }

  return squareUp;
}
