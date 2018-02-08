public String changeXY(String str) {
  if (str.equals("")) {
    return "";
  }

  if (str.substring(0, 1).equals("x")) {
    return "y" + changeXY(str.substring(1));
  }

  return str.substring(0, 1) + changeXY(str.substring(1));
}
