package inittest;
/*子类的初始化
   先初始化父类 （5）（1）
   后初始化子类 （10）（6）
 */


/*
  子类的实例化方法
    1.super()最前
    2. i=test()
    3.子类的非静态代码块
    4.子类的无参构造（最后）
 */
public class Son extends Father {
    private int i = test();
    private static int j = method();
    static{
        System.out.println("(6)");
    }
    Son(){
        System.out.println("(7)");
    }
    {
        System.out.println("(8)");
    }
    public int test(){
        System.out.println("(9)");
        return 1;
    }
    public static int method(){
        System.out.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }
}
