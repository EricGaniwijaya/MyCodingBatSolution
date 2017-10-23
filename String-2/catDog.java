public boolean catDog(String str) {
    int catAppear = 0;
    int dogAppear = 0;
    
    int index = 0;
    
    while(index != -1) {
        index = str.indexOf("cat", index);
        if(index >= 0) {
          catAppear++;
          index += "cat".length();
        }
    }
    
    index = 0;
    
    while(index != -1) {
      index = str.indexOf("dog", index);
      if(index >= 0) {
          dogAppear++;
          index += "dog".length();
        }
    }
    
    return catAppear == dogAppear;
}
