public int diff21(int n) {
    if(n > 21) {
        return 2*Math.abs(n-21);
    }
    
    return 21-n;
}
