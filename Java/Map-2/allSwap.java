public String[] allSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap<>();
  String[] results = new String[strings.length];

  for(int i = 0; i < strings.length; i++) {
    if( map.containsKey( strings[i].charAt(0) ) ) {
      results[ map.get(strings[i].charAt(0)) ] = strings[i];
      results[i] = strings[ map.get(strings[i].charAt(0)) ];
      map.remove( strings[i].charAt(0) );
    } else {
      map.put(strings[i].charAt(0), i);
      results[i] = strings[i];
    }
  }

  return results;
}
