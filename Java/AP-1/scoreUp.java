public int scoreUp(String[] key, String[] answers) {
  int score = 0;

  for (int i = 0; i < key.length; i++) {
    if (key[i].equals(answers[i])) {
      score += 4;
    } else if (!key[i].equals(answers[i]) && !answers[i].equals("?")) {
      score -= 1;
    }
  }

  return score;
}
