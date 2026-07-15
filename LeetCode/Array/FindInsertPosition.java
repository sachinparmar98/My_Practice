class FindInsertPosition {
    public static void main(String[] args) {

        System.out.print(searchInsert(new int[] { 1, 4, 5, 6, 7, 8, }, 6));
    }

    public static int searchInsert(int[] nums, int target) {

        int l = nums.length / 2;
        int start = 0, end = l;
        if (target > nums[l]) {
            start = l;
            end = nums.length;
        }
        for (int i = start; i < end; i++) {
            if (nums[i] >= target)
                return i;

        }
        return end;
    }
}
