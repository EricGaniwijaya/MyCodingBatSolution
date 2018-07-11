public String front3(String str) {
  int length = 3;

  if (str.length() < 3) {
    length = str.length();
  }

  return str.substring(0, length) + str.substring(0, length) + str.substring(0, length);
}
