public String getSandwich(String str) {
  int index1 = 0;
  int index2 = 0;

  index1 = str.indexOf("bread");

  while (str.indexOf("bread", index1 + 1 + index2) >= 0) {
    index2 = str.indexOf("bread", index1 + 1 + index2);
  }

  if (index1 >= 0 && index2 > 0) {
    return str.substring(index1 + 5, index2);
  }

  return "";
}
