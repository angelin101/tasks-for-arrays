package HomeWork.homeWork2;/** * Created by ������� on 19.07.2015. * ���� ������������������ ����� ����� a1, a2, ..., an. ��������, ����� ����� ����������� ������ � ������������� ��� �������������. */public class ArraysTask3 {    public static void main(String[] args) {        int[] array = {0, -52, 37, -63, 67, 21, -75};        for (int i = 0; i < array.length; i++){            if (array[i] > 0) {                System.out.println("������ ������������ ������������� �����.");                System.out.println(array[i]);                break;            }            if (array[i] < 0) {                System.out.println("������ ������������ ������������� �����");                System.out.println(array[i]);                break;            }        }    }}