public boolean closeFar(int a, int b, int c) {
    int differAB = Math.abs(a-b);
    int differAC = Math.abs(a-c);
    
    if(differAB <= 1 && differAC <= 1) {
        return false;
    }
    else if(differAB <= 1) {
        if(Math.abs(b-c) > 1) {
            return true;
        }
    }
    else if(differAC <= 1) {
      if(Math.abs(b-c) > 1) {
            return true;
        }
    }
    
    return false;
}
