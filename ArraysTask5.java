/**
 * Created by ������� on 19.07.2015.
 * ���� ������������������ ����������� ����� a1, a2, ..., an.
 * ������� ������ �� ������ ����� ���� ������������������.
 * ���� ����� ����� ���, �� ������� ��������� �� ���� �����.
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
            System.out.println("������ ����� � ������ ������������������ ����������� ����� - ���!");
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
