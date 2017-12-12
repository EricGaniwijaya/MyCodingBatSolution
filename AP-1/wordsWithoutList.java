public List wordsWithoutList(String[] words, int len) {
  List<String> list = new ArrayList<>();

  for(String word: words) {
    if(word.length() != len) {
      list.add(word);
    }
  }

  return list;
}
