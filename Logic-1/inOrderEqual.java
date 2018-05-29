public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if (!equalOk && c > b && b > a) {
    return true;
  }
  
  if (equalOk && c >= b && b >= a) {
    return true;
  }
  
  return false;
}
