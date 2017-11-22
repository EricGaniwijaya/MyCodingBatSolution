public Map<String, String> pairs(String[] strings) {
    Map<String, String> map = new HashMap<String, String>();
    
    for(String stringsUnit : strings) {
        map.put(stringsUnit.substring(0, 1), stringsUnit.substring(stringsUnit.length()-1, stringsUnit.length()));
    }
    
    return map;
}
