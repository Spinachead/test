package inittest;

public class lingxing {
    public static void main(String[] args) {

      lingxing(5);

    }
    public static void  lingxing(int n){
        // 上半部分(n为层数)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 下半部分
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - 1 - i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
