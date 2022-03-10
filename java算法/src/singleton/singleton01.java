package singleton;

import java.util.*;

public class singleton01 {
    public static final singleton01 INSTANCE = new singleton01();
    private singleton01(){

    }

    public static void main(String[] args) {

        Demo.class.toString();
        ArrayList arr = new ArrayList();
        ArrayList arr2 = new ArrayList();
        arr.add(1);
        arr.add(5);
        arr.add(3);
        arr.forEach(x-> System.out.println(x));

        HashMap map = new HashMap();
        map.put(1,2);
        map.hashCode();
        HashSet set01=new HashSet();
        TreeMap treeMap = new TreeMap();

    }
}
