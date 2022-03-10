package datastructure;

import inittest.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation {
    public static void main(String[] args) {
        String suffixExpression = "3 4 + 5 * 6 -";
        List<String> list = getListString(suffixExpression);
        int res = calculate(list);
        System.out.println("��������="+res);
    }
    //��һ���沨�����ʽ���ν����ݺ���������뵽arraylist��
    public static List<String> getListString(String suffixExpression){
        String[] split = suffixExpression.split(" ");
        List<String> list = new ArrayList<String>();
        for (String ele:split)
        {
            list.add(ele);
        }
        return list;
    }
    //��ɶ��沨�����ʽ������
    public static int calculate(List<String> ls){
        Stack<String> stack = new Stack<String>();
        for (String item:
             ls) {
            if(item.matches("\\d+")){
                stack.push(item);
            }else{
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if(item.equals("+")){
                    res = num1+num2;
                }else if(item.equals("-")){
                    res = num1-num2;
                }else if(item.equals("*")){
                    res = num1*num2;
                }else if(item.equals("/")){
                    res = num1/num2;
                }else{
                    throw new RuntimeException("���������");
                }
                stack.push(""+res);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
