public int makeChocolate(int small, int big, int goal) {
  int count = 0;

  while(big > 0 && goal >= 5) {
    goal -= 5;
    big--;
  }

  while(small > 0 && goal != 0) {
    goal--;
    small--;
    count++;
  }

  return goal == 0 ? count : - 1;
}
