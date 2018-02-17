public int scoresSpecial(int[] a, int[] b) {
  return largestScoreSpecial(a) + largestScoreSpecial(b);
}

private int largestScoreSpecial(int[] arr) {
  int score = 0;

  for (int num: arr) {
    if (num % 10 == 0 && num > score) {
      score = num;
    }
  }

  return score;
}
