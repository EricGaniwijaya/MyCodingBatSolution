public int countHi(String str) {
  if (str.equals("") || str.length() <= 1) {
    return 0;
  }

  if (str.substring(0, 2).equals("hi")) {
    return 1 + countHi(str.substring(2));
  } else {
    return countHi(str.substring(1));
  }
}
