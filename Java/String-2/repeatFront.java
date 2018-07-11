public String repeatFront(String str, int n) {
  String solution = "";

  for (int i = 0; i < n; i++) {
    solution += str.substring(0, n - i);
  }

  return solution;
}
