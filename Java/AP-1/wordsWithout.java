public String[] wordsWithout(String[] words, String target) {
  int nonTargetCount = 0;

  for (String word: words) {
    if (!word.equals(target)) {
      nonTargetCount++;
    }
  }

  String[] newWords = new String[nonTargetCount];
  int curr = 0;

  for (int i = 0; i < words.length; i++) {
    if (!words[i].equals(target)) {
      newWords[curr++] = words[i];
    }
  }

  return newWords;
}
