public boolean sameStarChar(String str) {
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == '*') {
      if (i - 1 < 0 || i + 1 >= str.length()) {
        continue;
      } else if (str.charAt(i - 1) != str.charAt(i + 1)) {
        return false;
      }
    }
  }

  return true;
}
