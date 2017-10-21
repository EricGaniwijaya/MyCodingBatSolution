public int countHi(String str) {
    int count = 0;
    int lastIndex = 0;
    
    do {
        lastIndex = str.indexOf("hi", lastIndex);
        
        if(lastIndex != -1) {
          count++;
          lastIndex += "hi".length();
        }
        
    } while(lastIndex != -1);
    
    return count;
}
