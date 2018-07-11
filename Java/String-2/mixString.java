public String mixString(String a, String b) {
  String mix = "";

  int length = a.length() <= b.length() ? a.length() : b.length();

  for(int i = 0; i < length; i++) {
    mix += a.charAt(i);
    mix += b.charAt(i);
  }

  if(a.length() > b.length()) {
    mix += a.substring(length);
  } else if(b.length() > a.length()) {
    mix += b.substring(length);
  }

  return mix;
}
