public int[] plusTwo(int[] a, int[] b) {
  int[] joinedArray = new int[a.length + b.length];
  
  for (int i = 0; i < a.length; i++) {
    joinedArray[i] = a[i];
  }
  
  for (int i = 0; i < b.length; i++) {
    joinedArray[i + a.length] = b[i];
  }
  
  return joinedArray;
}
