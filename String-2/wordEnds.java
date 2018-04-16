public String wordEnds(String str, String word) {
  String result = "";
  
  outer: for (int i = 0; i < str.length(); i++) {
    for (int j = 0; j < word.length(); j++) {
      if (str.charAt(i + j) != word.charAt(j)) {
        continue outer;
      }
    }
    
    if (i - 1 >= 0) {
      result += str.charAt(i - 1);
    }
    
    if (i + word.length() < str.length()) {
      result += str.charAt(i + word.length());
    }
    
    i += word.length() - 1;
  }
  
  return result;
}
