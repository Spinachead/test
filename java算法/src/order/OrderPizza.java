package order;

import pizza.CheesePizza;
import pizza.GreekPizza;
import pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType;
//        do{
//            orderType = gettype();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }
//            else if(orderType.equals(("cheese"))){
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }
//            else {
//                break;
//            }
//            //输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }
     //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }
    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        this.simpleFactory = simpleFactory;
        do {
            orderType = gettype();
           pizza =  this.simpleFactory.createPizza(orderType);
           if(pizza!=null){
               pizza.prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           }
           else {
               System.out.println("订购失败");
               break;
           }
        }while(true);
    }
    //这个方法可以获取客户希望订购的披萨种类
    private String gettype(){
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        }catch(IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
