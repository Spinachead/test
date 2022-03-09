package leetcode.swordOffer;

/**
 * 剑指Offer58 左旋字符串
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 */
public class offer58 {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public static String reverseLeftWords2(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    //利用取余运算简化2的代码
    public static String reverseLeftWords3(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < n + s.length(); i++) {
            res.append(s.charAt(i % s.length()));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
//        System.out.println(reverseLeftWords(s,2));
        System.out.println(reverseLeftWords3(s, 3));
    }
}
