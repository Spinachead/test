package leetcode;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Candies {
    public static void main(String[] args) {
        int[] type={1,1,2,3};
        System.out.println(distributeCandies2(type));

    }
    public  static int distributeCandies(int[] candies){
        Arrays.sort(candies);
        int count=1;
        int n=candies.length;
        for (int i = 1; i <candies.length ; i++) {
            if(candies[i]>candies[i-1]){
                count++;
            }
        }

        return Math.min(n/2,count);
    }
    public static int distributeCandies2(int[] candies){
        Set<Integer> set = new HashSet<Integer>() ;
        for (int candy:candies)
        {
            set.add(candies[candy]);
        }
        return Math.min(set.size(),candies.length/2);
    }
}
