public boolean makeBricks(int small, int big, int goal) {
    int bigNeeded = goal/5;
    int leftNeeded = 0;
    
    if(bigNeeded <= big) {
      leftNeeded = goal - (bigNeeded * 5);
    }
    else {
      leftNeeded = goal - (big * 5);
    }
    
    if(leftNeeded == 0) {
      return true;
    }
    else {
      if(leftNeeded <= small) {
        return true;
      }
      else {
        return false;
      }
    }
}