public String everyNth(String str, int n) {
  String solution = "";
  
  for (int i = 0; i < str.length(); i++) {
    if (i % n == 0) {
      solution += str.substring(i, i+1);
    }
  }
  
  return solution;
}
