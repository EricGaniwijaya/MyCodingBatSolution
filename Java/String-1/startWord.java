public String startWord(String str, String word) {
  if (str.length() < word.length()) {
    return "";  
  }
  
  if (str.substring(0, word.length()).equals(word)) {
    return word;
  }
  
  if (str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
    return str.substring(0, word.length());
  } 
  
  return "";
}
