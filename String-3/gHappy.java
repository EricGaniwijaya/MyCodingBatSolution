public boolean gHappy(String str) {
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == 'g') {
          if(i-1 >= 0 && str.charAt(i-1) == 'g') {
              continue;
          }
          else if(i+1<str.length() && str.charAt(i+1) == 'g') {
              continue;
          }
          
          return false;
      }
    }
    
    return true;
}
