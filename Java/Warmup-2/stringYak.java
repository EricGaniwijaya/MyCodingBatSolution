public String stringYak(String str) {
  String solution = "";

  for(int i = 0; i < str.length(); i++) {
    if (i + 2 < str.length() && str.substring(i, i + 3).equals("yak")) {
      i += 2;
      continue;
    }

    solution += str.substring(i, i + 1);
  }

  return solution;
}
