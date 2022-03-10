package singleton;

import javax.swing.text.StyledEditorKit;
import java.io.IOException;
import java.util.*;

public class HWtest {

    public static void main(String[] args) {
        int[] arr ={4,2,2,3,1};
        for (int i = 0; i <answer(arr).length ; i++) {
            System.out.println(answer(arr)[i]);
        }
    }
    public static int[] answer(int[] arr){
        int[] ints = Arrays.copyOf(arr, arr.length);
         Arrays.sort(ints);
        Map<Integer,Integer> map=new HashMap<>();
        int flag=10;
        for(int i=0;i<ints.length;i++){
            if(!map.containsKey(ints[i])){
                map.put(ints[i],flag);
                flag++;
            }
        }
        int[] nums2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            nums2[i]=map.get(arr[i]);
        }

       Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums2.length;i++){
            set.add(nums2[i]);
        }
        int size = set.size();
        int[] nums3 = new int[size];
        for (int i = 0; i <set.size() ; i++) {
            if(nums2[i]!=nums2[i+1]){
                nums3[i]=nums2[i];
            }
        }

        int[] nums4 = new int[2*size];
        for(int i=0; i<2*size;i++){
            if(i<size){
                nums4[i] = nums3[i];
            }else{
                nums4[i] = nums3[i-size];
            }
        }
        Arrays.sort(nums4);
        return nums4;

    }


}


