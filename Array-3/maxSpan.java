public int maxSpan(int[] nums) {
    if(nums.length == 0) {
        return 0;
    }
    
    int maxSpan = 0;
    
    for(int i = 0; i < nums.length; i++) {
        for(int j = nums.length - 1; j >= i; j--) {
            if(nums[i] == nums[j]) {
                int span = 1 + j - i;
                
                if(maxSpan < span) {
                    maxSpan = span;
                }
            }
        }
    }
    
    return maxSpan;
}
