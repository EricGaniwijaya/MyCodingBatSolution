public int commonTwo(String[] a, String[] b) {
  int count = 0;
  a = new HashSet<String>(Arrays.asList(a)).toArray(new String[0]);
  b = new HashSet<String>(Arrays.asList(b)).toArray(new String[0]);
  int len = (a.length < b.length) ? a.length : b.length;
  
  for (int i = 0, j = 0; i < a.length && j < b.length;) {
    if (a[i].compareTo(b[j]) > 0) {
      j++;
      continue;
    }
    
    if (a[i].compareTo(b[j]) < 0) {
      i++;
      continue;
    }
    
    count++;
    i++;
    j++;
  }
  
  return count;
}
