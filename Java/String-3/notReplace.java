public String notReplace(String str) {
  String solution = "";

  for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);

    if (c == 'i') {
      if (i + 1 < str.length() && str.charAt(i + 1) == 's') {
        if (i == 0) {
          if (i + 2 == str.length()) {
            solution += "is not";
            i++;
            continue;
          }
           if (i + 2 < str.length() && !Character.isLetter(str.charAt(i + 2))) {
            solution += "is not";
            i++;
            continue;
          }

        } else if (i - 1 > 0 && !Character.isLetter(str.charAt(i - 1))) {
          if (i + 2 == str.length()) {
            solution += "is not";
            i++;
            continue;
          }
          if (i + 2 < str.length() && !Character.isLetter(str.charAt(i + 2))) {
            solution += "is not";
            i++;
            continue;
          }
        }
      }

      solution += c;
    } else {
      solution += c;
    }
  }

  return solution;
}
