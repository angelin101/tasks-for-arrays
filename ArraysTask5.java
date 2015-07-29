/**
 * Created by Ангелин on 19.07.2015.
 * Дана последовательность натуральных чисел a1, a2, ..., an.
 * Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */
public class ArraysTask5 {
    public static void main(String[] args) {
        int[] array = {6, 18, 3, 15, 21, 30, 10, 26};
        int newArrayLength = 0;
        int[] newArray = null;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                newArrayLength++;
        if (newArrayLength == 0)
            System.out.println("Четных чисел в данной последовательности натуральных чисел - НЕТ!");
        else {
            newArray = new int[newArrayLength];
            int j = 0;
            for (int i = 0; i < array.length; i++)
                if (array[i] % 2 == 0) {
                    newArray[j] = array[i];
                    j++;
                }
        }
        for (int i = 0; i < newArrayLength; i++)
            System.out.print(newArray[i]+" ");
    }
}
