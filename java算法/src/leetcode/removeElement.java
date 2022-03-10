package leetcode;

public class removeElement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        System.out.println(removelement(nums,3));

    }
    public static int removelement(int[] nums,int val)
    {
        int n=nums.length;
        int left=0;
        for(int right=0; right<n; right++)
        {
            if(nums[right]!=val)
            {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
