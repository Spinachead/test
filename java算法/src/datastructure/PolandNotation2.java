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
        System.out.printf("����Ľ����%d",calculate(suffixExpressionList));
    }
    //����׺���ʽת�ɶ�Ӧ��list
    public static List<String> toInfixExpressionList(String s){
        List<String> ls = new ArrayList<String>();
        int i=0;
        char c;
        String str;
        do{
            //���c��һ�������֣���Ҫ���뵽ls
            if((c=s.charAt(i))<48 || (c=s.charAt(i))>57){
                ls.add(""+c);
                i++;
            }
            else{
                //�����һ��������Ҫ���Ƕ�λ��
                str="";       //�Ƚ�str��λ""
                while(i<s.length() && (c=s.charAt(i))>=48 && (c=s.charAt(i))<=57){
                    str+=c;
                    i++;
                }
                 ls.add(str);
            }
        }while(i<s.length());
        return ls;
    }
    //���õ�����׺���ʽ��Ӧ��listת��Ϊ��׺���ʽ��Ӧ��list
    public static List<String> parseSuffixExpressionList(List<String> ls){
        Stack<String> s1 = new Stack<String>();   //����ջ
        List<String>  s2 = new ArrayList<String>(); //�洢�м�����s2
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
class Operation{
    private static int ADD = 1;
    private static int SUB = 1;
    private static int MUL = 2;
    private static int DIV = 2;
    //���ز�������Ӧ�����ȼ�����
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
                System.out.println("�����ڸ������");
                break;
        }
        return result;
    }
}
