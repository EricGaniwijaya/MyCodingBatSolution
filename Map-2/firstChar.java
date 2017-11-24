public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    
    for(String s: strings) {
      String key = s.substring(0,1);
      if(map.containsKey(key)) {
          map.put(key, map.get(key) + s);
      }
      else {
          map.put(key, s);
      }
      
    }
    
    return map;
}
