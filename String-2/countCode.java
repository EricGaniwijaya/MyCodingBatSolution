public int countCode(String str) {
    return countCodeHelper(str, '?');
}

public int countCodeHelper(String str, char before) {
    if(str.length() == 0) {
        return 0;
    }
  
    if(before == '?' && str.charAt(0) == 'c') {
        return countCodeHelper(str.substring(1, str.length()), 'c');
    }
    else if(before == 'c' && str.charAt(0) == 'o') {
        return countCodeHelper(str.substring(1, str.length()), 'o');
    }
    else if(before == 'o') {
        return countCodeHelper(str.substring(1, str.length()), ' ');
    }
    else if(before == ' ' && str.charAt(0) == 'e') {
        return 1 + countCodeHelper(str.substring(1, str.length()), '?');
    }
    else if(str.charAt(0) == 'c') {
       return countCodeHelper(str.substring(1, str.length()), str.charAt(0));
    }
    else {
       return countCodeHelper(str.substring(1, str.length()), '?');
    }
}
