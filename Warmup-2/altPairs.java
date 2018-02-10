public String altPairs(String str) {
  String solution = "";

  for (int i = 0; i < str.length(); i++) {
    if (i % 4 <= 1) {
      solution += str.substring(i, i+1);
    }
  }

  return solution;
}
