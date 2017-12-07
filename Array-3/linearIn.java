public boolean linearIn(int[] outer, int[] inner) {
  int j = 0;
  int count = 0;

  for(int i = 0; i < outer.length && j < inner.length; i++) {
    if(outer[i] == inner[j]) {
      count++;
      j++;
    }
  }

  return count == inner.length ? true : false;
}
