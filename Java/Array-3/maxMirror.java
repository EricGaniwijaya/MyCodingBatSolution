public int maxMirror(int[] nums) {
  int length = 0;
  int tempLength = 0;

  for(int i = 0; i < nums.length; i++) {
    int tempI = i;
   for(int j = nums.length - 1; j >= 0; j--) {
     if(tempI < nums.length && nums[tempI] == nums[j]) {
       tempLength++;
       tempI++;
     } else {
       if(length < tempLength) {
          length = tempLength;
       }
       tempLength = 0;
       tempI = i;
     }
   }

  if(length < tempLength) {
        length = tempLength;
    }
    tempLength = 0;
    tempI = i;
  }

  return length;
}
