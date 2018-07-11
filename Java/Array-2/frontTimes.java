public String frontTimes(String str, int n) {
    String temp = "";
    int length = str.length() < 3 ? str.length() : 3;
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < length; j++) {
            temp += str.charAt(j);
        }
    }
    
    return temp;
}