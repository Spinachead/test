package leetcode;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StrHelper {
    public static void main(String[] args) {
        String str = "Fe2(SO4)3";
        System.out.println(countOfAtoms(str));
    }
    public static int i;

    public  static String countOfAtoms(String formula) {

        i=0;
        StringBuilder ans=new StringBuilder();
        Map<String,Integer> count=parse(formula);
        for(String name : count.keySet()) {
            ans.append(name);
            int num=count.get(name);
            if(num>1) ans.append(""+num);
        }
        return ans.toString();

    }

    public static Map<String,Integer> parse(String formula){

        int N=formula.length();
        Map<String,Integer> count=new TreeMap<>();
        while(i<N && formula.charAt(i)!=')') {
            if(formula.charAt(i)=='(') {
                i++;
                for(Map.Entry<String, Integer> entry : parse(formula).entrySet()) {
                    count.put(entry.getKey(), count.getOrDefault(entry.getKey(), 0)+entry.getValue());
                }
            }
            else {
                int start=i++;
                while(i<N && Character.isLowerCase(formula.charAt(i))) i++;
                String name=formula.substring(start, i);
                start=i;
                while(i<N && Character.isDigit(formula.charAt(i))) i++;
                int num=start<i?Integer.parseInt(formula.substring(start, i)):1;
                count.put(name, count.getOrDefault(name, 0)+num);
            }
        }
        int start=++i;
        while(i<N && Character.isDigit(formula.charAt(i))) i++;
        if(start<i) {
            int num=Integer.parseInt(formula.substring(start, i));
            for(String key : count.keySet())
                count.put(key, count.get(key)*num);
        }
        return count;
    }
}
