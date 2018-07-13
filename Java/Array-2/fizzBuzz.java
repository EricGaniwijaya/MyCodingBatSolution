public String[] fizzBuzz(int start, int end) {
  String[] arr = new String[end-start];
  int index = 0;
  
  for (int i = start; i < end; i++, index++) {
    if (i % 15 == 0) {
      arr[index] = "FizzBuzz";
    } else if (i % 5 == 0) {
      arr[index] = "Buzz";
    } else if (i % 3 == 0) {
      arr[index] = "Fizz";
    } else {
      arr[index] = String.valueOf(i);
    }
  }
  
  return arr;
}
