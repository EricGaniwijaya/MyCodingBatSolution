public Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    for(String string: strings) {
      map.put(string, 0);
    }
    
    return map;
}
