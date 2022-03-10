package singlettontest;

import singleton.Singleton03;

public class test03 {
    public static void main(String[] args) {
        Singleton03 s = Singleton03.INSTANCE;
        System.out.println(s);
    }
}
