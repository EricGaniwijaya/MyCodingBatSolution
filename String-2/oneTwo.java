public String oneTwo(String str) {
  int loop = str.length() / 3;
  str = str.substring(0, loop * 3);
  char[] strArr = str.toCharArray();

  while (loop-- > 0) {
    char temp = strArr[loop * 3];
    char temp2 = strArr[loop * 3 + 1];

    strArr[loop * 3 + 1] = strArr[loop * 3 + 2];
    strArr[loop * 3] = temp2;
    strArr[loop * 3 + 2] = temp;
  }

  return String.valueOf(strArr);
}
