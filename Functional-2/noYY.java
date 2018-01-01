public List<String> noYY(List<String> strings) {
  return strings.stream()
    .map(s -> s + "y")
    .filter(s -> !s.contains("yy"))
    .collect(Collectors.toList());
}
