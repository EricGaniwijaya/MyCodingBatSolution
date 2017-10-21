public int countYZ(String str) {
    int count = 0;
    
    for(int i = 0; i < str.length(); i++) {
        if(str.charAt(i) == 'y' || str.charAt(i) == 'z' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z') {
            if(i + 1 != str.length()) {
                if(!Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
            else {
                count++;
            }
        }
    }
    
    return count;
}
