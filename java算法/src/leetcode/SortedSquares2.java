package leetcode;

public class SortedSquares2 {
    public static void main(String[] args) {
       int[] a ={5,7,7,8,8,10};
       int t=8;
        for (int k:searchRange(a,t)
             ) {

            System.out.println(k);
        }

    }
    public static     int[] searchRange(int[] nums,int target){
        int len = nums.length;
        if(len==0){return new int[]{-1,-1};}
        int firstPosition = findFirstPosition(nums,target);
        if(firstPosition==-1){return  new int[]{-1,-1};}
        return new int[]{firstPosition,10};
    }

   public static int findFirstPosition(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right)
        {
            int mid=(left+right)>>>1;
            if(nums[mid]<target)
            {
                //下一轮搜索的空间是[mid+1,right]
                left=mid+1;
            }else if(nums[mid]==target){
                //下一轮搜索空间是[left,mid]
                right=mid;
            }else{
                //nums[mid]>target,下一轮搜索空间是[left,mid-1]
                right=mid-1;
            }
        }
        if(nums[left]==target)
        {
            return left;
        }
        return -1;
   }
}
