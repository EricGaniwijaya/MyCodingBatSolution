public boolean prefixAgain(String str, int n) {
  for (int i = 1; i <= str.length() - n; i++) {
    if (str.substring(0, n).equals(str.substring(i, i + n))) {
      return true;
    }
  }

  return false;
}
