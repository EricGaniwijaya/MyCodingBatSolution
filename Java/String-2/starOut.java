public String starOut(String str) {
  String result = "";
  Boolean in = true;
  
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) != '*') {
      in = true;
      
      if (i > 0 && str.charAt(i - 1) == '*') {
        in = false;
      }
      
      if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
        in = false;
      }
      
      if (in) {
        result += str.substring(i, i + 1);
      }
    }
  }
  
  return result;
}
