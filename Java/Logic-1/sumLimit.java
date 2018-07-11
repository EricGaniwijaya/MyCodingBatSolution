public int sumLimit(int a, int b) {
  int sum = a + b;
  
  int digitOfSum = String.valueOf(sum).length();
  int digitOfA = String.valueOf(a).length();
  
  if (digitOfA < digitOfSum) {
    return a;
  }
  
  return sum;
}
