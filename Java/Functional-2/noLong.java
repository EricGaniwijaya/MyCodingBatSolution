public List<String> noLong(List<String> strings) {
  strings.removeIf(string -> string.length() >= 4);

  return strings;
}
