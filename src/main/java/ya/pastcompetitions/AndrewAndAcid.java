package ya.pastcompetitions;

import java.util.Scanner;

/**
 * @author Dmitry Kartsev
 */
public class AndrewAndAcid {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int[] array = new int[n.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int max = array[0];
        int min = array[0];
        int answer = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
            if (array[i] < max) {
                answer = -1;
                break;
            }
        }

        if (answer == 0) {
            System.out.println(max - min);
        } else System.out.println("answer" + answer);
    }
}
