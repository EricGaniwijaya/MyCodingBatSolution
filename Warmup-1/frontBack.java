public String frontBack(String str) {
  String solution = "";

  for (int i = 0; i < str.length(); i++) {
    if (i == 0) {
      solution += str.substring(str.length() - 1, str.length());
    } else if (i == str.length() - 1) {
      solution += str.substring(0, 1);
    } else {
      solution += str.substring(i, i+1);
    }
  }

  return solution;
}
