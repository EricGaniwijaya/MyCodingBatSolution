public int sum67(int[] nums) {
  int sum = 0;
  boolean rangeOf67 = false;

  for(int num: nums) {
    if(rangeOf67 == true) {
      if(num == 7) {
        rangeOf67 = false;
      }
    } else if(rangeOf67 == false) {
      switch(num) {
        case 6: rangeOf67 = true;
                break;
        default: sum+= num;
      }
    }
  }

  return sum;
}
