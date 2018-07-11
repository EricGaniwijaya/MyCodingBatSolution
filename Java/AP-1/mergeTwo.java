public String[] mergeTwo(String[] a, String[] b, int n) {
  int counter = n;
  int aCounter = 0;
  int bCounter = 0;
  
  String[] c = new String[n];
  
  for (int i = 0; i < n; i++) {
    if (a[aCounter].compareTo(b[bCounter]) == 0) {
      c[i] = a[aCounter++];
      bCounter++;
      continue;
    }
    
    if (a[aCounter].compareTo(b[bCounter]) < 0) {
      if (i > 0 && c[i - 1].equals(a[aCounter])) {
        c[i] = b[bCounter++];
      } else {
        c[i] = a[aCounter++];
      }
    } else {
      if (i > 0 && c[i - 1].equals(b[bCounter])) {
        c[i] = a[aCounter++];
      } else {
        c[i] = b[bCounter++];
      }
    }
  }
  
  return c;
}
