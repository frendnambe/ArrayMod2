import java.util.Random;
import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int lenghtSecondArray = 0, count = 0;
        System.out.print("Введите количество элементов первого массива: ");

        int lenghtFirstArray = in.nextInt();
        int[] firstArray;
        firstArray = new int[lenghtFirstArray];

        System.out.println("Массив равен:");
        for (int i = 0; i < firstArray.length; i++)
        {
            firstArray[i] = rnd.nextInt(1,50);
            System.out.print(firstArray[i] + " ");
            if (firstArray[i] % 2 == 0)
               lenghtSecondArray++;
        }
        System.out.println();

        int[] secondArray;
        secondArray = new int[lenghtSecondArray];
        System.out.println("Новый массив равен: ");
        for (int i = 0; i < firstArray.length; i++)
        {
            if (firstArray[i] % 2 == 0)
            {
                secondArray[count] = firstArray[i];
                System.out.print(secondArray[count] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Длина исходного массива: " + firstArray.length);
        System.out.println("Длина нового массива: " + secondArray.length);
    }
}
