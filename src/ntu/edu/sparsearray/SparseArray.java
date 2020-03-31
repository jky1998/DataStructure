package ntu.edu.sparsearray;

/**
 *  稀疏数组
 *  @author Harley J
 *  @data 2019/8/25
 */

public class SparseArray {

    public static void main(String[] args) {

        // 创建一个二维数组 11 * 11
        // 0 表示没有棋子
        // 1 表示黑子
        // 2 表示白子

        /*
        将二维数组转化为稀疏数组
         */
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[5][6] = 1;

        System.out.println("原始的二维数组：");
        for (int[] row : chessArr1) {
            for (int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }

        // 将 二维数组 转换为 稀疏数组
        // 遍历数组 找到非0数的个数
        int sum = 0;
        for (int[] row : chessArr1) {
            for (int item : row) {
                if (item != 0) {
                    sum++;
                }
            }
        }
        //System.out.println(sum);

        // 创建对应的稀疏数组
        int[][] sparseArr = new int[sum + 1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        // 遍历二维数组，将非0的值放到稀疏数组中
        int x = 1;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    sparseArr[x][0] = i;
                    sparseArr[x][1] = j;
                    sparseArr[x][2] = chessArr1[i][j];
                    if (x < sum) x++;
                }
            }
        }
        System.out.println("=================================");

        // 打印稀疏数组
        System.out.println("稀疏数组：");
        for (int[] row : sparseArr) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
        System.out.println("=================================");

        /*
        将稀疏数组转化为二维数组
         */
        // 根据稀疏数组第一行创建一个原始二维数组
        int[][] chessArr2 = new int[sparseArr[0][0]][sparseArr[0][1]];

        // 读取后几行的数据，并赋给二维数组
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        // 查看新的二维数组
        System.out.println("转换后的二维数组为：");
        for (int[] row : chessArr2) {
            for (int item : row) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }

}
