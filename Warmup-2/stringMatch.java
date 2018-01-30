public int stringMatch(String a, String b) {
  int matchCount = 0;

  int loopLength = a.length() <= b.length() ? a.length() : b.length();

  for(int i = 0; i < loopLength - 1; i++) {
    String subA = a.substring(i, i+2);
    String subB = b.substring(i, i+2);

    if(subA.equals(subB)) {
      matchCount++;
    }
  }

  return matchCount;
}
