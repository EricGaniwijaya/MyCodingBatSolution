public boolean xyBalance(String str) {
  int x = str.lastIndexOf('x');
  int y = str.lastIndexOf('y');

  if(y >= x) {
    return true;
  }

  return false;
}
