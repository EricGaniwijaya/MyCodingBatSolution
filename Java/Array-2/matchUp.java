public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;

  for (int i = 0; i < nums1.length; i++) {
    int diff = nums1[i] - nums2[i];

    if (diff <= 2 && diff != 0 && diff >= -2) {
      count++;
    }
  }

  return count;
}
