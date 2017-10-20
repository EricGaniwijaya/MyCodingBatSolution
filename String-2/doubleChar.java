public String doubleChar(String str) {
    char[] charArray = new char[str.length() * 2];
    
    int index = 0;
    for(char c: str.toCharArray()) {
        charArray[index++] = c;
        charArray[index++] = c;
    }
    
    return new String(charArray);
}
