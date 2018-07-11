public String lastChars(String a, String b) {
  char aa = a.length() > 0 ? a.charAt(0) : '@';
  char bb = b.length() > 0 ? b.charAt(b.length() - 1) : '@';
  
  return "" + aa + bb;
}
