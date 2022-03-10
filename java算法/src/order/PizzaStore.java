package order;

import com.sun.org.apache.xpath.internal.operations.Or;

public class PizzaStore {
    public static void main(String[] args) {
       // new OrderPizza();
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }
}
