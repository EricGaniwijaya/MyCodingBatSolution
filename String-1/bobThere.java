public boolean bobThere(String str) {
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.charAt(i) == 'b') {
      i += 2;
      if(str.charAt(i) == 'b') {
        return true;
      }
    }
  }

  return false;
}
