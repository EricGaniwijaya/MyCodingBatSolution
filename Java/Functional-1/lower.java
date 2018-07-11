public List<String> lower(List<String> strings) {
  List<String> list = new ArrayList<String>();

  for(String s: strings) {
    list.add(s.toLowerCase());
  }

  return list;
}
