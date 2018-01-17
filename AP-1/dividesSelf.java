public boolean dividesSelf(int n) {
  int original = n;

  while(n != 0) {
    int divisor = n % 10;

    if(divisor == 0 || original % divisor != 0) {
      return false;
    }

    n /= 10;
  }

  return true;
}
