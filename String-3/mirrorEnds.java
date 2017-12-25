public String mirrorEnds(String string) {
  StringBuilder sb = new StringBuilder();

  for(int i = 0; i < string.length(); i++) {
    if(string.charAt(i) == string.charAt(string.length() - i - 1)) {
      sb.append(string.charAt(i));
    } else {
      break;
    }
  }

  return sb.toString();
}
