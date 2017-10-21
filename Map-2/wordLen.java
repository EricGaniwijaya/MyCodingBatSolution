public Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> map = new HashMap();
    
    for(String string: strings) {
      if(!map.containsKey(string)) {
          map.put(string, string.length());
      }
    }
    
    return map;
}
