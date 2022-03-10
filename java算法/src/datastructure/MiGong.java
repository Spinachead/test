package datastructure;

public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        //上下制位1
        for (int i = 0; i <7 ; i++) {
                map[0][i]=1;
                map[7][i]=1;
        }
        //左右制位1
        for(int i=0; i<8; i++){
            map[i][0]=1;
            map[i][6]=1;
        }
        map[3][1]=1;
        map[3][2]=1;
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <7; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        setWay(map,1,1);
        System.out.println("迷宫通路是");
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <7; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }

    }
public static boolean setWay(int[][] map,int i,int j) {
    if (map[6][5] == 2) {     //通路找到的标志
        return true;
    } else {
        if (map[i][j] == 0) {  //如果当前这个点还没有走过，按照下右上左的顺序走
            map[i][j] = 2;      //假定该点是可以走通的
            if (setWay(map, i, j)) {
                return true;
            } else if (setWay(map, i + 1, j)) {  //向下走
                return true;
            } else if (setWay(map, i, j + 1)) {   //向右走
                return true;
            } else if (setWay(map, i - 1, j)) {   //向上走
                return true;
            } else if (setWay(map, i, j - 1)) {   //向左走
                return true;
            } else {
                //说明是死路，走不通
                map[i][j] = 3;
                return false;
            }
        }else{
            //如果map[i][j]!=0,可能是1，2，3
            return false;
        }

    }
  }
}

