public int centeredAverage(int[] nums) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;
    
    for(int i = 0; i < nums.length; i++) {
        min = Math.min(min, nums[i]);
        max = Math.max(max, nums[i]);
        sum += nums[i];
    }
    
    int average = (sum - min - max)/(nums.length-2);
    
    return average;
}
