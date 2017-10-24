public int countEvens(int[] nums) {
    int countEvens = 0;
    
    for(int num: nums) {
        if(num % 2 == 0) {
            countEvens++;
        }
    }
    
    return countEvens;
}