package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PolandNotation2 {
    public static void main(String[] args) {
        String expression = "1+((2+3)*4)-5";
        List<String> infixExpressionList = toInfixExpressionList(expression);
        System.out.println(infixExpressionList);
        List<String> suffixExpressionList = parseSuffixExpressionList(infixExpressionList);
        System.out.println(suffixExpressionList);
        System.out.printf("运算的结果是%d",calculate(suffixExpressionList));
    }
    //将中缀表达式转成对应的list
    public static List<String> toInfixExpressionList(String s){
        List<String> ls = new ArrayList<String>();
        int i=0;
        char c;
        String str;
        do{
            //如果c是一个非数字，需要加入到ls
            if((c=s.charAt(i))<48 || (c=s.charAt(i))>57){
                ls.add(""+c);
                i++;
            }
            else{
                //如果是一个数字需要考虑多位数
                str="";       //先将str制位""
                while(i<s.length() && (c=s.charAt(i))>=48 && (c=s.charAt(i))<=57){
                    str+=c;
                    i++;
                }
                 ls.add(str);
            }
        }while(i<s.length());
        return ls;
    }
    //将得到的中缀表达式对应的list转化为后缀表达式对应的list
    public static List<String> parseSuffixExpressionList(List<String> ls){
        Stack<String> s1 = new Stack<String>();   //符号栈
        List<String>  s2 = new ArrayList<String>(); //存储中间结果的s2
        for(String item : ls){
            if(item.matches("\\d+")){s2.add(item);}
            else if(item.equals("(")){
                s1.add(item);
            }
            else if(item.equals(")")){
                while(!s1.peek().equals("(")){
                    s2.add(s1.pop());
                }
                s1.pop();
            }else {
                while (s1.size()!=0 && Operation.getValue(s1.peek())>=Operation.getValue(item)){
                    s2.add(s1.pop());
                }
                s1.push(item);
            }
        }
        while(s1.size()!=0){
            s2.add(s1.pop());
        }
        return s2;
    }
    //完成对逆波兰表达式的运算
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
                    throw new RuntimeException("运算符有误");
                }
                stack.push(""+res);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
class Operation{
    private static int ADD = 1;
    private static int SUB = 1;
    private static int MUL = 2;
    private static int DIV = 2;
    //返回操作符对应的优先级数字
    public static int getValue(String operation){
        int result = 0;
        switch (operation){
            case "+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case "*":
                result = MUL;
                break;
            case "/":
                result = DIV;
                break;
            default:
                System.out.println("不存在该运算符");
                break;
        }
        return result;
    }
}
