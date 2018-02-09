public String stringX(String str) {
  String solution = "";

  for (int i = 0; i < str.length(); i++) {
    if (i > 0 && i < str.length() && str.charAt(i) != 'x') {
      solution += str.substring(i, i+1);
    } else if (i == 0 || i == str.length() - 1) {
      solution += str.substring(i, i+1);
    }
  }

  return solution;
}
