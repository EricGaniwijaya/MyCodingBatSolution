public List<String> no34(List<String> strings) {
  strings.removeIf(string -> string.length() == 3 || string.length() == 4);

  return strings;
}
