public boolean in1To10(int n, boolean outsideMode) {
  if(n >= 1 && n <= 10 && outsideMode == false) {
    return true;
  } else {
    if(outsideMode == true && (n <= 1 || n >= 10)) {
      return true;
    }
  }

  return false;
}
