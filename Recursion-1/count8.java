public int count8(int n) {
  if(n == 0) {
    return 0;
  }

  int digit = n % 10;
  int leftDigit = (n % 100) / 10;

  if(digit == 8 && leftDigit == 8) {
    return 2 + count8(n/10);
  } else if(digit == 8) {
    return 1 + count8(n/10);
  } else {
    return count8(n/10);
  }
}
