public int loneSum(int a, int b, int c) {
    int sum = 0;
    
    if(a != b && a != c) {
        sum += a;
    }
    
    if(a != b && b != c) {
      sum += b;
    }
    
    if(a != c && c != b)
      sum += c;
    
    return sum;
}
