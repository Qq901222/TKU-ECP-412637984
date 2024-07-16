public class hm_18 {
    public static void main(String[] args) {
        int[][][] array = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };

        for (int z = 0; z < array.length; z++) {
            int sum = 0;
            for (int i = 0; i < array[z].length; i++) {
                for (int j = 0; j < array[z][i].length; j++) {
                    sum += array[z][i][j];
                }
            }
            double average = (double) sum / (array[z].length * array[z][0].length);
            System.out.println("第" + (z + 1) + "層的平均值是: " + average);
        }
    }
}
