import java.util.Arrays;
import java.util.Random;

public class ShuffleArray1 {
    
    public static void shuffle(int[] array) {
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        shuffle(array);

        System.out.println(Arrays.toString(array) );
        
           // Or else print using for each loop

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

