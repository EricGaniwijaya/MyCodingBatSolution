public int[] make2(int[] a, int[] b) {
  int[] res = new int[2];
  int counter = 0;
  
  for (int num: a) {
    if (counter == 2) {
      return res;
    }
    
    res[counter++] = num;
  }
  
  for (int num: b) {
    if (counter == 2) {
      return res;
    }
    
    res[counter++] = num;
  }
  
  return res;
}
