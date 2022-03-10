package singlettontest;

import singleton.singleton01;

public class test01 {
    public static void main(String[] args) {
       String str = "hello123";
       String rule = "*he";
        System.out.println(isRegularMatching(rule,str));
    }

    public static boolean isRegularMatching(String rule, String str) {
        int lRule = rule.length();
        int lStr = str.length();
        int iRule = 0;
        int iStr = 0;
        while (iRule < lRule && iStr < lStr) {
            switch (rule.charAt(iRule)) {   //第一次
                case '*': {
                    iRule += 1;
                    if (iRule >= lRule) {
                        return true;
                    } else {
                        for (int i = iStr; i < lStr; i++) {
                            if ((str.charAt(i)>='0') && (str.charAt(iStr)<='9')) {
                                return true;
                            }
                        }
                    }
                    break;
                }
                case '$': {
                    if (str==null) {
                        return false;
                    }
                    while ((iStr < lStr) && (str.charAt(iStr) >= '0') && (str.charAt(iStr) <= '9')) {
                        iStr += 1;
                    }
                    iRule += 1;
                    break;
                }
                default: {
                    if (rule.charAt(iRule) != str.charAt(iStr)) {
                        return false; //第四行
                    }
                    iRule += 1;
                    iStr += 1;
                    break;
                }
            }
        }
        if (iRule < lRule && iStr >= lStr) {
            if (rule.charAt(iRule) == '*') {
                return true;
            }
        } else {
            return false  ;  //第五行
        }
        return false;
    }

}
