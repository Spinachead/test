package leetcode;

import com.sun.org.apache.xpath.internal.SourceTree;

public class search {

    public static int Search(int[] nums, int target) {
       int p, left=0, right=nums.length-1;
       while(left<=right)
       {
           p=left+(right-left)/2;
           if(target==nums[p]) return p;
           if(target<nums[p]) right=p-1;
           else
               left=p+1;
       }
         return -1;
    }

    public static void main(String[] args) {
        int[] a={100,200,300,400,500};
        System.out.println(Search(a,100));
    }

}
