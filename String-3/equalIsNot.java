public boolean equalIsNot(String str) {
    int isCount = 0;
    int notCount = 0;
    
    int index = 0;
    while((index = str.indexOf("is", index)) >= 0) {
        isCount++;
        index += "is".length();
    }
    
    index = 0;
    while((index = str.indexOf("not", index)) >= 0) {
        notCount++;
        index += "not".length();
    }
    
    return isCount == notCount;
}
