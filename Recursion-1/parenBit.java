public String parenBit(String str) {
  if (str.length() <= 0) {
    return "";
  }
  
  if (str.charAt(0) == '(') {
    if (str.charAt(str.length() - 1) == ')') {
      return str;
    }
    
    return parenBit(str.substring(0, str.length() - 1));
  }
  
  return parenBit(str.substring(1));
}
