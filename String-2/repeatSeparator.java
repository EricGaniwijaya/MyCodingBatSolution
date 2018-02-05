public String repeatSeparator(String word, String sep, int count) {
  String solution = "";

  for(int i = 0; i < count; i++) {
    solution += word;

    if(i < count - 1) {
      solution += sep;
    }
  }

  return solution;
}
