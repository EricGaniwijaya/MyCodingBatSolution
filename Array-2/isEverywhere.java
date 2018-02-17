public boolean isEverywhere(int[] nums, int val) {
  boolean everywhere = true;

  // even index
  for (int i = 0; i < nums.length; i += 2) {
    if (nums[i] != val) {
      everywhere = false;
      break;
    }
  }

  if (everywhere) {
    return everywhere;
  }

  // odd index
  everywhere = true;
  for (int i = 1; i < nums.length; i += 2) {
    if (nums[i] != val) {
      everywhere = false;
      break;
    }
  }

  return everywhere;
}
