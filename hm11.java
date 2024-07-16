import java.util.Random;

public class hm11 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.println("array[" + i + "] = " + array[i]);
        }
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println("最大值是: " + max);
    }
}
