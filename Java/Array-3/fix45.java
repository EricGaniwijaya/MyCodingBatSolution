public int[] fix45(int[] nums) {
    int lastIndex = 0;
    
    for(int i = 0; i < nums.length - 1; i++) {
        if(nums[i] == 4) {
            for(int j = lastIndex; j < nums.length; j++) {
                if(nums[j] == 5 && j > 0 && nums[j-1] != 4) {
                    nums[j] = nums[i+1];
                    nums[i+1] = 5;
                    lastIndex = j;
                    break;
                }
                else if(nums[j] == 5 && j == 0) {
                    nums[j] = nums[i+1];
                    nums[i+1] = 5;
                    lastIndex = j;
                    break;  
                }
            }
        }
    }
    
    return nums;
}
