public String firstTwo(String str) {
  if(str.length() > 2) {
    str = str.substring(0, 2);
  }

  return str;
}
