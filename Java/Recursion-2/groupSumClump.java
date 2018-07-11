public boolean groupSumClump(int start, int[] nums, int target) {
    if(start >= nums.length) {
        return target == 0;
    }
    
    int groupSum = nums[start];
    
    for(int i = start; i < nums.length-1; i++) {
        if(nums[i+1] == nums[i]) {
            groupSum += nums[i+1];
            start = i+1;
        }
        else {
            break;
        }
    }
    
    return groupSumClump(start+1, nums, target) || groupSumClump(start+1, nums, target-groupSum);
}
