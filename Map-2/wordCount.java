public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    for(String stringUnit: strings) {
      if(map.containsKey(stringUnit)) {
        map.put(stringUnit, map.get(stringUnit) + 1);
      }
      else {
        map.put(stringUnit, 1);
      }
        
    }
    
    return map;
}
