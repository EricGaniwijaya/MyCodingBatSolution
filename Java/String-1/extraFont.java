public String extraFront(String str) {
  if (str.length() < 2) {
    return str + str + str;
  }
  
  String sub = str.substring(0, 2);
  
  return sub + sub + sub;
}
