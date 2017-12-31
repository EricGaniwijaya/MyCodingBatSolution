public int sumNumbers(String str) {
  int sum = 0;
  String temp = "";

  for(int i = 0; i < str.length(); i++) {
    if(Character.isDigit(str.charAt(i))) {
      temp += str.substring(i, i+1);
    } else {
      if(temp != "") { sum += Integer.parseInt(temp); }

      temp = "";
    }
  }

  if(temp != "") { sum += Integer.parseInt(temp); }

  return sum;
}
