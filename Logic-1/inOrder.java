public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (c > b) {
    if (!bOk) {
      if (b > a) {
        return true;
      }
      
      return false;
    }
    
    return true;
  }
  
  return false;
}
