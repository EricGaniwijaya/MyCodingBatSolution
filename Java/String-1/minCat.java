public String minCat(String a, String b) {
  if (a.length() == b.length()) {
    return a + b;
  }
  
  return a.length() > b.length() ? a.substring(a.length() - b.length(), a.length()) + b 
      : a + b.substring(b.length() -a.length(), b.length());
}
