package inittest;

public class Stand {
    public static void main(String[] args) {
        haiArray(4);
    }
    static int[][] haiArray(int size){
        int[][] printArray = new int[size][];
        int val=1;
        for (int i = 0; i <printArray.length ; i++) {
            printArray[i]=new int[i+1];
            for (int j = 0; j <printArray[i].length ; j++) {
                printArray[i][j] = (i+1)*(j+1);
                System.out.println(printArray[i][j]+" ");
            }
            System.out.println();
        }
        return printArray;
    }

    /**
     * @param {number} n
     * @return {string[]}
     */

}

