public boolean endOther(String a, String b) {
    if(a.length() > b.length()) {
       return b.toLowerCase().equals(a.toLowerCase().substring(a.length() - b.length()));
    }
    
    return a.toLowerCase().equals(b.toLowerCase().substring(b.length() - a.length()));
}
