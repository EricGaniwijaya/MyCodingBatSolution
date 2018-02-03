public String[] firstSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap<>();

  for(int i = 0; i < strings.length; i++) {
    char key = strings[i].charAt(0);

    if(!map.containsKey(key)) {
      map.put(key, i);
    } else {
      if(map.get(key) == -1) {
        continue;
      }

      String temp = strings[i];
      strings[i] = strings[map.get(key)];
      strings[map.get(key)] = temp;

      map.put(key, -1);
    }
  }

  return strings;
}
