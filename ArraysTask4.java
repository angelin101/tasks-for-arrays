/**
 * Created by Ангелин on 19.07.2015.
 * Дана последовательность действительных чисел a1, a2, ..., an. Выяснить, будет ли она возрастающей.
 */
public class ArraysTask4 {
    public static void main(String[] args) {
        double[] array = {-5.5, 15.7, 41.93, 53.0, 71.42};
        int val = 0;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] < array[i+1])
                val++;
        }
        if (val == array.length-1)
            System.out.println("Массив содержит возрастающие элементы");
        else
            System.out.println("Массив не содержит возрастающие элементы");
    }
}