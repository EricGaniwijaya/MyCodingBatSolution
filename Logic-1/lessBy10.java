public boolean lessBy10(int a, int b, int c) {
  int max = max(a, b, c);
  int min = min(a, b, c);
  
  return max - min >= 10;
}

private int max(int a, int b, int c) {
  int max = 0;
  
  max = (a > b) ? a : b;
  max = (max > c) ? max : c;
  
  return max;
}

private int min(int a, int b, int c) {
  int min = 0;
  
  min = (a > b) ? b : a;
  min = (min > c) ? c : min;
  
  return min;
}
