public boolean xyzMiddle(String str) {
  int pos = -1;

  while (str.indexOf("xyz", pos + 1) >= 0) {
    pos = str.indexOf("xyz", pos + 1);

    int diff = pos - (str.length() - (pos + 3));

    if (diff <= 1 && diff >= -1) {
      return true;
    }
  }

  return false;
}
