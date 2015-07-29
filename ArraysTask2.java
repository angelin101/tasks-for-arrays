/**
 * Created by Ангелин on 19.07.2015.
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */
public class ArraysTask2 {
    public static void main(String[] args) {
        int[] array = {0, 5, 8, 63, 53, 0, 9, 7, 34, 12, 30, 0};
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == 0)
                newArrayLength++;
        int[] newArray = new int[newArrayLength];
        int j = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] == 0) {
                newArray[j] = i;
                j++;
            }
        for (int i = 0; i < newArrayLength; i++)
            System.out.print(newArray[i]+" ");
    }
}
