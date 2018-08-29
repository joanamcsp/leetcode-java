class HouseRobber {

  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    int[] max = new int[nums.length];
    max[0] = nums[0];
    max[1] = nums[1];

    for (int i = 2; i < nums.length; i++) {
      if (i >= 3) {
        max[i] = Math.max(nums[i] + max[i - 2], nums[i] + max[i - 3]);
      } else {
        max[i] = nums[i] + max[i - 2];
      }
    }
    return Math.max(max[max.length - 1], max[max.length - 2]);
  }
}