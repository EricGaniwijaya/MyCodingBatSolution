public int maxBlock(String str) {
  if(str.length() == 0) {
    return 0;
  }

  int length = 1;
  int max = 0;

  for(int i = 1; i < str.length(); i++) {
    if(str.charAt(i) == str.charAt(i-1)) {
      length++;
    } else {
      if(length > max) {
        max = length;
      }
      length = 1;
    }
  }

  if(length > max) {
    max = length;
  }

  return max;
}
