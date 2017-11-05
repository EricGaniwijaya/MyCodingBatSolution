int countXX(String str) {
    int count = 0;
    int lastIndex = 0;
    
    while(lastIndex != -1) {
        lastIndex = str.indexOf("xx", lastIndex);
        
        if(lastIndex != -1) {
            count++;
            lastIndex++;
        }
    }
    
    return count;
}