public boolean xyzThere(String str) {
  int index = str.indexOf("xyz");

  while(index != -1) {
    int before = index - 1;

    if(before >= 0 && str.charAt(before) != '.') {
        return true;
    }
    else if(before < 0) {
        return true;
    }

    index = str.indexOf("xyz", index + "xyz".length());
  }

  return false;
}
