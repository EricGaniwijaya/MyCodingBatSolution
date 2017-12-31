public List<String> noX(List<String> strings) {
  strings.replaceAll(string -> string.replace("x", ""));

  return strings;
}
