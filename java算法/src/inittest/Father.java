package inittest;
/*
 父类的初始化<clinit>()
  静态类变量和静态代码块顺序执行

 */

/*
父类的实例化
    1.super()最前
    2. i=test()
    3.父类的非静态代码块
    4.父类的无参构造（最后）
 */

public class Father {
    private int i= test();
    private static int j = method();

    static{
        System.out.println("(1)");
    }
    Father(){
        System.out.println("(2)");
    }
    {
        System.out.println("(3)");
    }
    public int test(){
        System.out.println("(4)");
        return 1;
    }
    public static int method(){
        System.out.println("(5)");
        return 1;
    }
}
