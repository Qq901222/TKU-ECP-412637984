public class hm_17 {
    public static void main(String[] args) {
        int[][][] array = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        int x = 1;
        int y = 1;
        int z = 1;
        int newValue = 99;

        System.out.println("修改前的陣列：");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("array[" + i + "][" + j + "][" + k + "] = " + array[i][j][k]);
                }
            }
        }

        array[x][y][z] = newValue;

        System.out.println("修改後的陣列：");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println("array[" + i + "][" + j + "][" + k + "] = " + array[i][j][k]);
                }
            }
        }
    }
}
