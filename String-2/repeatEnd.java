public String repeatEnd(String str, int n) {
  String solution = "";

  for(int i = 0; i < n; i++) {
    solution += str.substring(str.length() - n, str.length());
  }

  return solution;
}
