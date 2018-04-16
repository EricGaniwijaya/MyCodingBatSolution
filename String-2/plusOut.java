public String plusOut(String str, String word) {
  String result = "";
  
  outer: for (int i = 0; i < str.length(); i++) {
    for (int j = 0; j < word.length(); j++) {
      if (str.charAt(i + j) != word.charAt(j)) {
        result += "+";
        continue outer;
      }
    }
    
    result += word;
    i += word.length() - 1;
  }
  
  return result;
}
