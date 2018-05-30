public boolean lastDigit(int a, int b, int c) {
  int count = 0;
  
  if (a % 10 == b % 10) return true;
  if (a % 10 == c % 10) return true;
  if (b % 10 == c % 10) return true;
  
  return false;
}
