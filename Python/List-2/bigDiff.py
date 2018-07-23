def big_diff(nums):
  maxVal = nums[0]
  minVal = nums[0]
  
  for num in nums[1:]:
    maxVal = max(maxVal, num)
    minVal = min(minVal, num)
    
  return maxVal - minVal
